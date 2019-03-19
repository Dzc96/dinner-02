package com.appointment.dinner.service;

import com.appointment.dinner.model.DynamicReport;

public interface DynamicReportService {
    int reportDynamic(DynamicReport dynamicReport);
    void reviewReport(DynamicReport dynamicReport);
    DynamicReport getDynamicReport(Integer reportId);
}
