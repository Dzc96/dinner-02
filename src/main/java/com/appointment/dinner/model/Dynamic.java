package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

public class Dynamic {
    /**
     * 广场动态自增id
     */
    @Id
    @Column(name = "dynamic_id")
    private Integer dynamicId;

    /**
     * 动态内容
     */
    private String desc;

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
     * 是否审核通过，0-否，1-是
     */
    @Column(name = "is_verify")
    private String isVerify;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "topic_id")
    private Integer topicId;

    /**
     * 获取广场动态自增id
     *
     * @return dynamic_id - 广场动态自增id
     */
    public Integer getDynamicId() {
        return dynamicId;
    }

    /**
     * 设置广场动态自增id
     *
     * @param dynamicId 广场动态自增id
     */
    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    /**
     * 获取动态内容
     *
     * @return desc - 动态内容
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置动态内容
     *
     * @param desc 动态内容
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取创建人id外键
     *
     * @return create_by - 创建人id外键
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人id外键
     *
     * @param createBy 创建人id外键
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

    /**
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * @return video_url
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
     * @return topic_id
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * @param topicId
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }
}