package com.appointment.dinner.controller;


import com.appointment.dinner.exception.LogicalVerificationException;
import com.appointment.dinner.message.R;
import com.appointment.dinner.model.DynamicReport;
import com.appointment.dinner.service.DynamicReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamicReport")
@Api("动态举报与审核")
public class DynamicReportController {
    @Autowired
    DynamicReportService dynamicReportService;

    @PostMapping("/")
    @ApiOperation("举报动态")
    public R<String> reportDynamic(DynamicReport dynamicReport) {
        try {
            if (dynamicReport != null) {
                int number = dynamicReportService.reportDynamic(dynamicReport);
                if (number > 0) {
                    return new R<>("举报成功");
                }
            }
        } catch (Exception e) {
            return new R<>(new LogicalVerificationException("举报失败"));
        }
        return new R<>(new LogicalVerificationException("举报失败"));
    }

    @PostMapping("/{reportId}")
    @ApiOperation("审核被举报动态")
    public R<String> reviewReport(@PathVariable("reportId") Integer reportId) {
        try {
            if (reportId != null) {
                DynamicReport dynamicReport = dynamicReportService.getDynamicReport(reportId);
                dynamicReport.setIsVerify("1");
                dynamicReportService.reviewReport(dynamicReport);
                //举报次数达到一定次数就封号处理，该功能暂时待定，对应的表是dynamic_report，根据dynamic_id做查询就能知道被举报了多少次
                return new R<>("审核成功");
            }
        } catch (Exception e) {
            return new R<>(new LogicalVerificationException("审核失败"));
        }
        return new R<>(new LogicalVerificationException("审核失败"));
    }




}
