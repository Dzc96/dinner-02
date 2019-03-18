package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "Chat_Msg")
@Data
public class ChatMsg {
    /**
     * 聊天室消息自增id
     */
    @Id
    @Column(name = "msg_id")
    private Integer msgId;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 发送人id
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_dte")
    private Date createDte;

}