package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_comment")
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

    /**
     * 获取商店评论自增id
     *
     * @return id - 商店评论自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商店评论自增id
     *
     * @param id 商店评论自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商店自增id外键
     *
     * @return shop_id - 商店自增id外键
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置商店自增id外键
     *
     * @param shopId 商店自增id外键
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取评论内容
     *
     * @return desc - 评论内容
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置评论内容
     *
     * @param desc 评论内容
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取评论人id外键
     *
     * @return create_by - 评论人id外键
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置评论人id外键
     *
     * @param createBy 评论人id外键
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_dte - 创建时间
     */
    public Date getCreateDte() {
        return createDte;
    }

    /**
     * 设置创建时间
     *
     * @param createDte 创建时间
     */
    public void setCreateDte(Date createDte) {
        this.createDte = createDte;
    }

    /**
     * 获取是否审核通过，0-否，1-是
     *
     * @return is_verify - 是否审核通过，0-否，1-是
     */
    public String getIsVerify() {
        return isVerify;
    }

    /**
     * 设置是否审核通过，0-否，1-是
     *
     * @param isVerify 是否审核通过，0-否，1-是
     */
    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify == null ? null : isVerify.trim();
    }
}