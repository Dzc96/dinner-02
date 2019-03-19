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
    private String content;

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

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "topic_id")
    private Integer topicId;

    private String location;

    @Column(name = "l_and_lat")
    private String lAndLat;

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
     * @return content - 动态内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置动态内容
     *
     * @param content 动态内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    /**
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * @return l_and_lat
     */
    public String getlAndLat() {
        return lAndLat;
    }

    /**
     * @param lAndLat
     */
    public void setlAndLat(String lAndLat) {
        this.lAndLat = lAndLat == null ? null : lAndLat.trim();
    }

    public Dynamic(Integer dynamicId, String content, Integer createBy, Date createDte, String imgUrl, String videoUrl, Integer topicId, String location, String lAndLat) {
        this.dynamicId = dynamicId;
        this.content = content;
        this.createBy = createBy;
        this.createDte = createDte;
        this.imgUrl = imgUrl;
        this.videoUrl = videoUrl;
        this.topicId = topicId;
        this.location = location;
        this.lAndLat = lAndLat;
    }

    public Dynamic() {
    }
}