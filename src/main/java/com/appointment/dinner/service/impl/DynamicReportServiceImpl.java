package com.appointment.dinner.service.impl;

import com.appointment.dinner.mapper.DynamicReportMapper;
import com.appointment.dinner.model.DynamicReport;
import com.appointment.dinner.service.DynamicReportService;
import io.swagger.annotations.Authorization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DynamicReportServiceImpl implements DynamicReportService {
    @Autowired
    private DynamicReportMapper dynamicReportMapper;

    @Override
    public int reportDynamic(DynamicReport dynamicReport) {
        int insert = dynamicReportMapper.insert(dynamicReport);
        return insert;
    }

    @Override
    public void reviewReport(DynamicReport dynamicReport) {
        dynamicReportMapper.updateByPrimaryKeySelective(dynamicReport);
    }

    @Override
    public DynamicReport getDynamicReport(Integer reportId) {
        return dynamicReportMapper.selectByPrimaryKey(reportId);
    }


}
