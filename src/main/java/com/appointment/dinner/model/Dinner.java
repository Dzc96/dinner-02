package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

public class Dinner {
    /**
     * 饭局id自增主键
     */
    @Id
    @Column(name = "dinner_id")
    private Integer dinnerId;

    /**
     * 饭局标题
     */
    private String title;

    /**
     * 饭局相关描述
     */
    private String desc;

    /**
     * 饭局大概开始日期
     */
    @Column(name = "from_dte")
    private Date fromDte;

    /**
     * 饭局大概结束日期
     */
    @Column(name = "end_dte")
    private Date endDte;

    /**
     * 饭店id外键
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * 饭局大概人数
     */
    private Integer member;

    /**
     * 平均消费
     */
    @Column(name = "avg_consume")
    private Double avgConsume;

    /**
     * 饭局类型,0-请吃饭,1-拼饭
     */
    private String type;

    /**
     * 饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     */
    @Column(name = "stat_cde")
    private String statCde;

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
     * 修改时间
     */
    @Column(name = "last_mod_dte")
    private Date lastModDte;

    /**
     * 获取饭局id自增主键
     *
     * @return dinner_id - 饭局id自增主键
     */
    public Integer getDinnerId() {
        return dinnerId;
    }

    /**
     * 设置饭局id自增主键
     *
     * @param dinnerId 饭局id自增主键
     */
    public void setDinnerId(Integer dinnerId) {
        this.dinnerId = dinnerId;
    }

    /**
     * 获取饭局标题
     *
     * @return title - 饭局标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置饭局标题
     *
     * @param title 饭局标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取饭局相关描述
     *
     * @return desc - 饭局相关描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置饭局相关描述
     *
     * @param desc 饭局相关描述
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取饭局大概开始日期
     *
     * @return from_dte - 饭局大概开始日期
     */
    public Date getFromDte() {
        return fromDte;
    }

    /**
     * 设置饭局大概开始日期
     *
     * @param fromDte 饭局大概开始日期
     */
    public void setFromDte(Date fromDte) {
        this.fromDte = fromDte;
    }

    /**
     * 获取饭局大概结束日期
     *
     * @return end_dte - 饭局大概结束日期
     */
    public Date getEndDte() {
        return endDte;
    }

    /**
     * 设置饭局大概结束日期
     *
     * @param endDte 饭局大概结束日期
     */
    public void setEndDte(Date endDte) {
        this.endDte = endDte;
    }

    /**
     * 获取饭店id外键
     *
     * @return shop_id - 饭店id外键
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 设置饭店id外键
     *
     * @param shopId 饭店id外键
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取饭局大概人数
     *
     * @return member - 饭局大概人数
     */
    public Integer getMember() {
        return member;
    }

    /**
     * 设置饭局大概人数
     *
     * @param member 饭局大概人数
     */
    public void setMember(Integer member) {
        this.member = member;
    }

    /**
     * 获取平均消费
     *
     * @return avg_consume - 平均消费
     */
    public Double getAvgConsume() {
        return avgConsume;
    }

    /**
     * 设置平均消费
     *
     * @param avgConsume 平均消费
     */
    public void setAvgConsume(Double avgConsume) {
        this.avgConsume = avgConsume;
    }

    /**
     * 获取饭局类型,0-请吃饭,1-拼饭
     *
     * @return type - 饭局类型,0-请吃饭,1-拼饭
     */
    public String getType() {
        return type;
    }

    /**
     * 设置饭局类型,0-请吃饭,1-拼饭
     *
     * @param type 饭局类型,0-请吃饭,1-拼饭
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     *
     * @return stat_cde - 饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     */
    public String getStatCde() {
        return statCde;
    }

    /**
     * 设置饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     *
     * @param statCde 饭局状态，0-匹配中，1-成功，2-取消，3-未到店消费，4-已到店消费
     */
    public void setStatCde(String statCde) {
        this.statCde = statCde == null ? null : statCde.trim();
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
     * 获取修改时间
     *
     * @return last_mod_dte - 修改时间
     */
    public Date getLastModDte() {
        return lastModDte;
    }

    /**
     * 设置修改时间
     *
     * @param lastModDte 修改时间
     */
    public void setLastModDte(Date lastModDte) {
        this.lastModDte = lastModDte;
    }
}