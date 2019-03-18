package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Dynamic_Report")
@Data
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

}