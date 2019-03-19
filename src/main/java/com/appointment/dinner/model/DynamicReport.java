package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dynamic_report")
public class DynamicReport {
    /**
     * 动态举报自增id
     */
    @Id
    @Column(name = "report_id")
    private Integer reportId;

    /**
     * 动态id
     */
    @Column(name = "dynamic_id")
    private Integer dynamicId;

    /**
     * 举报原因
     */
    private String reason;

    /**
     * 举报时间
     */
    @Column(name = "create_dte")
    private Date createDte;

    /**
     * 举报是否审核通过,0-否,1-是
     */
    @Column(name = "is_verify")
    private String isVerify;

    private String location;

    @Column(name = "long_and_lat")
    private String longAndLat;

    /**
     * 获取动态举报自增id
     *
     * @return report_id - 动态举报自增id
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * 设置动态举报自增id
     *
     * @param reportId 动态举报自增id
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取动态id
     *
     * @return dynamic_id - 动态id
     */
    public Integer getDynamicId() {
        return dynamicId;
    }

    /**
     * 设置动态id
     *
     * @param dynamicId 动态id
     */
    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    /**
     * 获取举报原因
     *
     * @return reason - 举报原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置举报原因
     *
     * @param reason 举报原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取举报时间
     *
     * @return create_dte - 举报时间
     */
    public Date getCreateDte() {
        return createDte;
    }

    /**
     * 设置举报时间
     *
     * @param createDte 举报时间
     */
    public void setCreateDte(Date createDte) {
        this.createDte = createDte;
    }

    /**
     * 获取举报是否审核通过,0-否,1-是
     *
     * @return is_verify - 举报是否审核通过,0-否,1-是
     */
    public String getIsVerify() {
        return isVerify;
    }

    /**
     * 设置举报是否审核通过,0-否,1-是
     *
     * @param isVerify 举报是否审核通过,0-否,1-是
     */
    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify == null ? null : isVerify.trim();
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
     * @return long_and_lat
     */
    public String getLongAndLat() {
        return longAndLat;
    }

    /**
     * @param longAndLat
     */
    public void setLongAndLat(String longAndLat) {
        this.longAndLat = longAndLat == null ? null : longAndLat.trim();
    }

    public DynamicReport(Integer reportId, Integer dynamicId, String reason, Date createDte, String isVerify, String location, String longAndLat) {
        this.reportId = reportId;
        this.dynamicId = dynamicId;
        this.reason = reason;
        this.createDte = createDte;
        this.isVerify = isVerify;
        this.location = location;
        this.longAndLat = longAndLat;
    }

    public DynamicReport() {
    }


    @Override
    public String toString() {
        return "DynamicReport{" +
                "reportId=" + reportId +
                ", dynamicId=" + dynamicId +
                ", reason='" + reason + '\'' +
                ", createDte=" + createDte +
                ", isVerify='" + isVerify + '\'' +
                ", location='" + location + '\'' +
                ", longAndLat='" + longAndLat + '\'' +
                '}';
    }
}