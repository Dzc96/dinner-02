package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Dinner_Order")
@Data
public class DinnerOrder {
    /**
     * 饭局订单自增id
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 饭局id外键
     */
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 二维码凭证
     */
    @Column(name = "qr_cde")
    private String qrCde;

    /**
     * 订单生成时间
     */
    @Column(name = "create_dte")
    private Date createDte;

}