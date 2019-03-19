package com.appointment.dinner.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import javax.persistence.*;

@Table(name = "chat_msg")
@ApiModel("聊天室消息实体类")
public class ChatMsg {
    /**
     * 聊天室消息自增id
     */
    @Id
    @Column(name = "msg_id")
    @ApiModelProperty(name = "消息id",dataType = "int",example = "1")
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

    /**
     * 获取聊天室消息自增id
     *
     * @return msg_id - 聊天室消息自增id
     */
    public Integer getMsgId() {
        return msgId;
    }

    /**
     * 设置聊天室消息自增id
     *
     * @param msgId 聊天室消息自增id
     */
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    /**
     * 获取消息内容
     *
     * @return msg - 消息内容
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置消息内容
     *
     * @param msg 消息内容
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * 获取发送人id
     *
     * @return create_by - 发送人id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置发送人id
     *
     * @param createBy 发送人id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_dte - 创建时间
     */
    public Date getCreateDte() {
        return createDte;
    }

    /**
     * 设置创建时间
     *
     * @param createDte 创建时间
     */
    public void setCreateDte(Date createDte) {
        this.createDte = createDte;
    }
}