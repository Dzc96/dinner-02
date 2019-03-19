package com.appointment.dinner;

import com.appointment.dinner.model.DynamicReport;
import com.appointment.dinner.service.impl.DynamicReportServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class DynamicReportTests extends DinnerApplicationTests{

    @Autowired
    private DynamicReportServiceImpl service;

    @Test
    public void testReportDynamic() {
        DynamicReport dynamicReport = new DynamicReport(1,2223, "涉及色情", new Date(), "0",
                "广州", "6666,6666");
        int i = service.reportDynamic(dynamicReport);
        System.out.println(i);
    }

    @Test
    public void testGetDynamicReport() {
        DynamicReport dynamicReport = service.getDynamicReport(1);
        System.out.println(dynamicReport);
    }

    @Test
    public void testReviewReport() {
        DynamicReport dynamicReport = service.getDynamicReport(1);
        dynamicReport.setIsVerify("1");
        service.reviewReport(dynamicReport);
    }

}
