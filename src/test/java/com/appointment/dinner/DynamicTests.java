package com.appointment.dinner;

import com.appointment.dinner.model.Dynamic;
import com.appointment.dinner.service.DynamicService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class DynamicTests extends DinnerApplicationTests {
    @Autowired
    private DynamicService dynamicService;

    /**
     *  public Dynamic(Integer dynamicId, String desc, Integer createBy, Date createDte,
     *  String imgUrl, String videoUrl, Integer topicId,
     *  String location, String longAndLat) {
     */
    @Test
    public void testInsertDynamic() {
        Dynamic dynamic = new Dynamic(2223,"这是一条动态",10001, new Date(),"xxxjpg",
                "xxxmp4", 10, "广东省广州市","66666.666");
        dynamicService.insertDynamic(dynamic);
    }

    @Test
    public void testGetDynamic() {
//        Dynamic dynamic = new Dynamic();
//        dynamic.setDynamicId(1);
        Dynamic dddd = dynamicService.getDynamic(1);
        System.out.println(dddd);
    }

    @Test
    public void testUpdateDynamic() {
        Dynamic dynamic = new Dynamic();
        dynamic.setDynamicId(2223);
        dynamic.setContent("这是更新后的数据！！！");
        dynamicService.updateDynamic(dynamic);
    }

}
