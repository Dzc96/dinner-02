package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;

@Table(name="Food")
@Data
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

}