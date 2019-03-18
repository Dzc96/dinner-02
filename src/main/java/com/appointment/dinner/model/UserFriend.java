package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "User_Friend")
@Data
public class UserFriend {
    /**
     * 好友列表主键自增id
     */
    @Id
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 好友id
     */
    @Column(name = "friend_id")
    private Integer friendId;

    /**
     * 好友类型，0-临时好友(饭友)，1-好友，2-唯一好友
     */
    @Column(name = "friend_type")
    private String friendType;

    /**
     * 是否确认添加，0-否，1-是
     */
    @Column(name = "is_confim")
    private String isConfim;

    /**
     * 是否删除
     */
    @Column(name = "is_del")
    private String isDel;

}