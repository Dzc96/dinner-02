package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "User_Credit")
@Data
public class UserCredit {
    /**
     * 用户个人信誉自增id
     */
    @Id
    @Column(name = "credit_id")
    private Integer creditId;

    /**
     * 用户id外键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 守约次数
     */
    @Column(name = "success_count")
    private Integer successCount;

    /**
     * 违约次数
     */
    @Column(name = "break_count")
    private Integer breakCount;

    /**
     * 举报次数
     */
    @Column(name = "report_count")
    private Integer reportCount;

}