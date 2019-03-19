package com.appointment.dinner.model;

import javax.persistence.*;

@Table(name = "user_credit")
public class UserCredit {
    /**
     * 用户个人信誉自增id
     */
    @Id
    @Column(name = "credit_id")
    private Integer creditId;

    /**
     * 用户id外键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 守约次数
     */
    @Column(name = "success_count")
    private Integer successCount;

    /**
     * 违约次数
     */
    @Column(name = "break_count")
    private Integer breakCount;

    /**
     * 举报次数
     */
    @Column(name = "report_count")
    private Integer reportCount;

    /**
     * 获取用户个人信誉自增id
     *
     * @return credit_id - 用户个人信誉自增id
     */
    public Integer getCreditId() {
        return creditId;
    }

    /**
     * 设置用户个人信誉自增id
     *
     * @param creditId 用户个人信誉自增id
     */
    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取用户id外键
     *
     * @return user_id - 用户id外键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id外键
     *
     * @param userId 用户id外键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取守约次数
     *
     * @return success_count - 守约次数
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * 设置守约次数
     *
     * @param successCount 守约次数
     */
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * 获取违约次数
     *
     * @return break_count - 违约次数
     */
    public Integer getBreakCount() {
        return breakCount;
    }

    /**
     * 设置违约次数
     *
     * @param breakCount 违约次数
     */
    public void setBreakCount(Integer breakCount) {
        this.breakCount = breakCount;
    }

    /**
     * 获取举报次数
     *
     * @return report_count - 举报次数
     */
    public Integer getReportCount() {
        return reportCount;
    }

    /**
     * 设置举报次数
     *
     * @param reportCount 举报次数
     */
    public void setReportCount(Integer reportCount) {
        this.reportCount = reportCount;
    }
}