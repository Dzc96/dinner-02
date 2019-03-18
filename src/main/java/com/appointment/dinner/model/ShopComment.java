package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Shop_Comment")
@Data
public class ShopComment {
    /**
     * 商店评论自增id
     */
    @Id
    private Integer id;

    /**
     * 商店自增id外键
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 评论内容
     */
    private String desc;

    /**
     * 评论人id外键
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_dte")
    private Date createDte;

    /**
     * 是否审核通过，0-否，1-是
     */
    @Column(name = "is_verify")
    private String isVerify;

}