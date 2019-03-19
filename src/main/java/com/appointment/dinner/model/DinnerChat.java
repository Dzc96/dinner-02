package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "dinner_chat")
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

    /**
     * 获取饭局聊天室自增id
     *
     * @return chat_id - 饭局聊天室自增id
     */
    public Integer getChatId() {
        return chatId;
    }

    /**
     * 设置饭局聊天室自增id
     *
     * @param chatId 饭局聊天室自增id
     */
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
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
     * 获取创建人id外键
     *
     * @return create_by - 创建人id外键
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人id外键
     *
     * @param createBy 创建人id外键
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

    /**
     * 获取是否删除,0-否，1-是
     *
     * @return is_del - 是否删除,0-否，1-是
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除,0-否，1-是
     *
     * @param isDel 是否删除,0-否，1-是
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}