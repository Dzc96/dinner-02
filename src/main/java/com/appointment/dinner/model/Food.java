package com.appointment.dinner.model;

import javax.persistence.*;

public class Food {
    /**
     * 美食自增id
     */
    @Id
    @Column(name = "food_id")
    private Integer foodId;

    /**
     * 美食名称
     */
    @Column(name = "food_name")
    private String foodName;

    /**
     * 获取美食自增id
     *
     * @return food_id - 美食自增id
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置美食自增id
     *
     * @param foodId 美食自增id
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取美食名称
     *
     * @return food_name - 美食名称
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * 设置美食名称
     *
     * @param foodName 美食名称
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }
}