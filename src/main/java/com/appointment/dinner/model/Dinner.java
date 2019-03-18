package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name="Dinner")
@Data
public class Dinner {
    /**
     * 饭局id自增主键
     */
    @Id
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 饭局标题
     */
    private String title;

    /**
     * 饭局相关描述
     */
    private String desc;

    /**
     * 饭局大概开始日期
     */
    @Column(name = "from_dte")
    private Date fromDte;

    /**
     * 饭局大概结束日期
     */
    @Column(name = "end_dte")
    private Date endDte;

    /**
     * 饭店id外键
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 饭局大概人数
     */
    private Integer member;

    /**
     * 平均消费
     */
    @Column(name = "avg_consume")
    private Double avgConsume;

    /**
     * 饭局类型,0-请吃饭,1-拼饭
     */
    private String type;

    /**
     * 饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     */
    @Column(name = "stat_cde")
    private String statCde;

    /**
     * 创建人id外键
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_dte")
    private Date createDte;

    /**
     * 修改时间
     */
    @Column(name = "last_mod_dte")
    private Date lastModDte;

}