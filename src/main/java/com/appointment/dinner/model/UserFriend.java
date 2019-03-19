package com.appointment.dinner.model;

import javax.persistence.*;

@Table(name = "user_friend")
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

    /**
     * 获取好友列表主键自增id
     *
     * @return id - 好友列表主键自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置好友列表主键自增id
     *
     * @param id 好友列表主键自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取好友id
     *
     * @return friend_id - 好友id
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * 设置好友id
     *
     * @param friendId 好友id
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    /**
     * 获取好友类型，0-临时好友(饭友)，1-好友，2-唯一好友
     *
     * @return friend_type - 好友类型，0-临时好友(饭友)，1-好友，2-唯一好友
     */
    public String getFriendType() {
        return friendType;
    }

    /**
     * 设置好友类型，0-临时好友(饭友)，1-好友，2-唯一好友
     *
     * @param friendType 好友类型，0-临时好友(饭友)，1-好友，2-唯一好友
     */
    public void setFriendType(String friendType) {
        this.friendType = friendType == null ? null : friendType.trim();
    }

    /**
     * 获取是否确认添加，0-否，1-是
     *
     * @return is_confim - 是否确认添加，0-否，1-是
     */
    public String getIsConfim() {
        return isConfim;
    }

    /**
     * 设置是否确认添加，0-否，1-是
     *
     * @param isConfim 是否确认添加，0-否，1-是
     */
    public void setIsConfim(String isConfim) {
        this.isConfim = isConfim == null ? null : isConfim.trim();
    }

    /**
     * 获取是否删除
     *
     * @return is_del - 是否删除
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除
     *
     * @param isDel 是否删除
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}