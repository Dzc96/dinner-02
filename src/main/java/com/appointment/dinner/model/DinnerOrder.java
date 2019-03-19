package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dinner_order")
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

    /**
     * 获取饭局订单自增id
     *
     * @return order_id - 饭局订单自增id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置饭局订单自增id
     *
     * @param orderId 饭局订单自增id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
     * 获取二维码凭证
     *
     * @return qr_cde - 二维码凭证
     */
    public String getQrCde() {
        return qrCde;
    }

    /**
     * 设置二维码凭证
     *
     * @param qrCde 二维码凭证
     */
    public void setQrCde(String qrCde) {
        this.qrCde = qrCde == null ? null : qrCde.trim();
    }

    /**
     * 获取订单生成时间
     *
     * @return create_dte - 订单生成时间
     */
    public Date getCreateDte() {
        return createDte;
    }

    /**
     * 设置订单生成时间
     *
     * @param createDte 订单生成时间
     */
    public void setCreateDte(Date createDte) {
        this.createDte = createDte;
    }
}