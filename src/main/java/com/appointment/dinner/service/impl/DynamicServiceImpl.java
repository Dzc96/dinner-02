package com.appointment.dinner.service.impl;

import com.appointment.dinner.mapper.DynamicMapper;
import com.appointment.dinner.model.Dynamic;
import com.appointment.dinner.service.DynamicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public int insertDynamic(Dynamic dynamic) {
        int insert = dynamicMapper.insert(dynamic);
        return insert;
    }

    @Override
    public void deleteDynamic(Integer dynamicId) {
        dynamicMapper.deleteByPrimaryKey(dynamicId);
    }


    @Override
    public void updateDynamic(Dynamic dynamic) {
        dynamicMapper.updateByPrimaryKey(dynamic);
    }

    @Override
    public Dynamic getDynamic(Integer dynamicId) {
        Dynamic dynamic = dynamicMapper.selectByPrimaryKey(dynamicId);
        return dynamic;
    }

}
