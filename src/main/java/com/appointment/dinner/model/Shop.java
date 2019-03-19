package com.appointment.dinner.model;

import javax.persistence.*;

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

    /**
     * 获取商店自增id
     *
     * @return shop_id - 商店自增id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商店自增id
     *
     * @param shopId 商店自增id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取商店名称
     *
     * @return name - 商店名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商店名称
     *
     * @param name 商店名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商店地址
     *
     * @return place - 商店地址
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置商店地址
     *
     * @param place 商店地址
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * 获取商店介绍
     *
     * @return desc - 商店介绍
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置商店介绍
     *
     * @param desc 商店介绍
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取商店平均消费
     *
     * @return avg_consume - 商店平均消费
     */
    public Double getAvgConsume() {
        return avgConsume;
    }

    /**
     * 设置商店平均消费
     *
     * @param avgConsume 商店平均消费
     */
    public void setAvgConsume(Double avgConsume) {
        this.avgConsume = avgConsume;
    }

    /**
     * 获取商店好评数
     *
     * @return praise - 商店好评数
     */
    public Integer getPraise() {
        return praise;
    }

    /**
     * 设置商店好评数
     *
     * @param praise 商店好评数
     */
    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    /**
     * 获取商店人气
     *
     * @return popularity - 商店人气
     */
    public Integer getPopularity() {
        return popularity;
    }

    /**
     * 设置商店人气
     *
     * @param popularity 商店人气
     */
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}