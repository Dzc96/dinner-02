package com.appointment.dinner.service;

import com.appointment.dinner.model.Dynamic;

public interface DynamicService {
    int insertDynamic(Dynamic dynamic);
    void deleteDynamic(Integer dynamicId);
    void updateDynamic(Dynamic dynamic);
    Dynamic getDynamic(Integer dynamicId);
}
