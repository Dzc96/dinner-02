package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "Shop")
@Data
public class Shop {
    /**
     * 商店自增id
     */
    @Id
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 商店名称
     */
    private String name;

    /**
     * 商店地址
     */
    private String place;

    /**
     * 商店介绍
     */
    private String desc;

    /**
     * 商店平均消费
     */
    @Column(name = "avg_consume")
    private Double avgConsume;

    /**
     * 商店好评数
     */
    private Integer praise;

    /**
     * 商店人气
     */
    private Integer popularity;

}