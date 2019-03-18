package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Dinner_Chat")
@Data
public class DinnerChat {
    /**
     * 饭局聊天室自增id
     */
    @Id
    @Column(name = "chat_id")
    private Integer chatId;

    /**
     * 饭局id外键
     */
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 创建人id外键
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_dte")
    private Date createDte;

    /**
     * 是否删除,0-否，1-是
     */
    @Column(name = "is_del")
    private String isDel;


}