package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dynamic_comment")
public class DynamicComment {
    /**
     * 动态评论自增id
     */
    @Id
    private Integer id;

    /**
     * 动态id外键
     */
    @Column(name = "dynamic_id")
    private Integer dynamicId;

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
     * 评论时间
     */
    @Column(name = "create_dte")
    private Date createDte;

    /**
     * 是否审核通过，0-否，1-是
     */
    @Column(name = "is_verify")
    private String isVerify;

    /**
     * 获取动态评论自增id
     *
     * @return id - 动态评论自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置动态评论自增id
     *
     * @param id 动态评论自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取动态id外键
     *
     * @return dynamic_id - 动态id外键
     */
    public Integer getDynamicId() {
        return dynamicId;
    }

    /**
     * 设置动态id外键
     *
     * @param dynamicId 动态id外键
     */
    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
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
     * 获取评论时间
     *
     * @return create_dte - 评论时间
     */
    public Date getCreateDte() {
        return createDte;
    }

    /**
     * 设置评论时间
     *
     * @param createDte 评论时间
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