package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dinner_user")
public class DinnerUser {
    /**
     * 饭局中间表自增id
     */
    @Id
    private Integer id;

    /**
     * 饭局id外键
     */
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 参与者用户id外键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 是否加入，0-否，1-是
     */
    @Column(name = "is_join")
    private String isJoin;

    /**
     * 是否交了保证金,0-否,1-是
     */
    @Column(name = "is_commit_margin")
    private String isCommitMargin;

    /**
     * 加入时间
     */
    @Column(name = "join_dte")
    private Date joinDte;

    /**
     * 退出时间
     */
    @Column(name = "out_dte")
    private Date outDte;

    /**
     * 获取饭局中间表自增id
     *
     * @return id - 饭局中间表自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置饭局中间表自增id
     *
     * @param id 饭局中间表自增id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取参与者用户id外键
     *
     * @return user_id - 参与者用户id外键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置参与者用户id外键
     *
     * @param userId 参与者用户id外键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取是否加入，0-否，1-是
     *
     * @return is_join - 是否加入，0-否，1-是
     */
    public String getIsJoin() {
        return isJoin;
    }

    /**
     * 设置是否加入，0-否，1-是
     *
     * @param isJoin 是否加入，0-否，1-是
     */
    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin == null ? null : isJoin.trim();
    }

    /**
     * 获取是否交了保证金,0-否,1-是
     *
     * @return is_commit_margin - 是否交了保证金,0-否,1-是
     */
    public String getIsCommitMargin() {
        return isCommitMargin;
    }

    /**
     * 设置是否交了保证金,0-否,1-是
     *
     * @param isCommitMargin 是否交了保证金,0-否,1-是
     */
    public void setIsCommitMargin(String isCommitMargin) {
        this.isCommitMargin = isCommitMargin == null ? null : isCommitMargin.trim();
    }

    /**
     * 获取加入时间
     *
     * @return join_dte - 加入时间
     */
    public Date getJoinDte() {
        return joinDte;
    }

    /**
     * 设置加入时间
     *
     * @param joinDte 加入时间
     */
    public void setJoinDte(Date joinDte) {
        this.joinDte = joinDte;
    }

    /**
     * 获取退出时间
     *
     * @return out_dte - 退出时间
     */
    public Date getOutDte() {
        return outDte;
    }

    /**
     * 设置退出时间
     *
     * @param outDte 退出时间
     */
    public void setOutDte(Date outDte) {
        this.outDte = outDte;
    }
}