package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dinner_comment")
public class DinnerComment {
    /**
     * 饭局评论自增id
     */
    @Id
    @Column(name = "comment_id")
    private Integer commentId;

    /**
     * 饭局id外键
     */
    @Column(name = "dinner_id")
    private Integer dinnerId;

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
     * 获取饭局评论自增id
     *
     * @return comment_id - 饭局评论自增id
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * 设置饭局评论自增id
     *
     * @param commentId 饭局评论自增id
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * 获取饭局id外键
     *
     * @return dinner_id - 饭局id外键
     */
    public Integer getDinnerId() {
        return dinnerId;
    }

    /**
     * 设置饭局id外键
     *
     * @param dinnerId 饭局id外键
     */
    public void setDinnerId(Integer dinnerId) {
        this.dinnerId = dinnerId;
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