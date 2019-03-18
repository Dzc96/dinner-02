package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Dinner_User")
@Data
public class DinnerUser {
    /**
     * 饭局中间表自增id
     */
    @Id
    private Integer id;

    /**
     * 饭局id外键
     */
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 参与者用户id外键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 是否加入，0-否，1-是
     */
    @Column(name = "is_join")
    private String isJoin;

    /**
     * 是否交了保证金,0-否,1-是
     */
    @Column(name = "is_commit_margin")
    private String isCommitMargin;

    /**
     * 加入时间
     */
    @Column(name = "join_dte")
    private Date joinDte;

    /**
     * 退出时间
     */
    @Column(name = "out_dte")
    private Date outDte;


}