package com.appointment.dinner.model;

import javax.persistence.*;

public class Tag {
    /**
     * 标签自增id
     */
    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    /**
     * 标签名称
     */
    @Column(name = "tag_name")
    private String tagName;

    /**
     * 获取标签自增id
     *
     * @return tag_id - 标签自增id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置标签自增id
     *
     * @param tagId 标签自增id
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取标签名称
     *
     * @return tag_name - 标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置标签名称
     *
     * @param tagName 标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}