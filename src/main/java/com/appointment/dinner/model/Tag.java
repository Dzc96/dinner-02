package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;

@Table(name ="Tag")
@Data
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

}