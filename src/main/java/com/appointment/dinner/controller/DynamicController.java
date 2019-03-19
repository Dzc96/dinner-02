package com.appointment.dinner.controller;

import com.appointment.dinner.exception.LogicalVerificationException;
import com.appointment.dinner.message.R;
import com.appointment.dinner.model.Dynamic;
import com.appointment.dinner.service.DynamicService;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_EXCLUSIONPeer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/dynamic")
@Api("动态广场")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;


    /**
     * 1.没有对图片、视频做处理，应该保存到服务器某个路径下，把这个路径保存到URL
     * 2.要把动态和topic进行关联，涉及到dynamic表和topic表
     * @param dynamic
     * @return
     */
    @PostMapping("/")
    @ApiOperation("发布动态")
    public R<String> insertDynamic(Dynamic dynamic) {
        try {
            if (dynamic != null) {
                dynamic.setCreateDte(new Date());
                int number = dynamicService.insertDynamic(dynamic);
                if (number > 0) {
                    return new R<>("发布动态成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new R<>(new LogicalVerificationException("发布动态失败"));
    }

    @PostMapping("/{dynamicId}")
    @ApiOperation("删除动态")
    public R<String> deleteDynamic(@PathVariable("dynamicId") Integer dynamicId) {
        try {
            if (dynamicId != null) {
                dynamicService.deleteDynamic(dynamicId);
                return new R<>("删除动态成功");
            }
        } catch (Exception e) {
            return new R<>(new LogicalVerificationException("删除动态失败"));
        }
        return new R<>(new LogicalVerificationException("删除动态失败"));
    }


    @GetMapping("/{dynamicId}")
    @ApiOperation("查看动态")
    public R<Dynamic> getDynamic(@PathVariable("dynamicId") Integer dynamicId) {
        try {
            if (dynamicId != null) {
                Dynamic dynamic = dynamicService.getDynamic(dynamicId);
                return new R<>(dynamic);
            }
        } catch (Exception e) {
            return new R<>(new LogicalVerificationException("删除动态失败"));
        }

        return new R<>(new LogicalVerificationException("删除动态失败"));
    }

}
