package com.appointment.dinner.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 自增主键id
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户帐号，用手机号登录可取消该字段
     */
    private String account;

    /**
     * 用户密码，密文存储
     */
    private String password;

    /**
     * 性别，0-女，1-男
     */
    private String sex;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 系统名称，在用户注册完后系统自动生成
     */
    @Column(name = "sys_name")
    private String sysName;

    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 系统头像url
     */
    @Column(name = "sys_img")
    private String sysImg;

    /**
     * 真实头像url
     */
    @Column(name = "real_img")
    private String realImg;

    /**
     * 个性标签，","隔开，也可改为中间表
     */
    @Column(name = "tag_list")
    private String tagList;

    /**
     * 喜好美食，个性标签，","隔开，也可改为中间表
     */
    @Column(name = "food_list")
    private String foodList;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 用户所在地区
     */
    private String regn;

    /**
     * 保证金，可用一张表比如钱包存储
     */
    private Double margin;

    /**
     * 是否实名制,0-否,1-是
     */
    @Column(name = "is_real_name")
    private String isRealName;

    /**
     * 是否禁用，0-否，1-是
     */
    @Column(name = "is_del")
    private String isDel;

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
     * 获取自增主键id
     *
     * @return user_id - 自增主键id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置自增主键id
     *
     * @param userId 自增主键id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户帐号，用手机号登录可取消该字段
     *
     * @return account - 用户帐号，用手机号登录可取消该字段
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户帐号，用手机号登录可取消该字段
     *
     * @param account 用户帐号，用手机号登录可取消该字段
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取用户密码，密文存储
     *
     * @return password - 用户密码，密文存储
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码，密文存储
     *
     * @param password 用户密码，密文存储
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取性别，0-女，1-男
     *
     * @return sex - 性别，0-女，1-男
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别，0-女，1-男
     *
     * @param sex 性别，0-女，1-男
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取系统名称，在用户注册完后系统自动生成
     *
     * @return sys_name - 系统名称，在用户注册完后系统自动生成
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 设置系统名称，在用户注册完后系统自动生成
     *
     * @param sysName 系统名称，在用户注册完后系统自动生成
     */
    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    /**
     * 获取用户真实姓名
     *
     * @return real_name - 用户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realName 用户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取系统头像url
     *
     * @return sys_img - 系统头像url
     */
    public String getSysImg() {
        return sysImg;
    }

    /**
     * 设置系统头像url
     *
     * @param sysImg 系统头像url
     */
    public void setSysImg(String sysImg) {
        this.sysImg = sysImg == null ? null : sysImg.trim();
    }

    /**
     * 获取真实头像url
     *
     * @return real_img - 真实头像url
     */
    public String getRealImg() {
        return realImg;
    }

    /**
     * 设置真实头像url
     *
     * @param realImg 真实头像url
     */
    public void setRealImg(String realImg) {
        this.realImg = realImg == null ? null : realImg.trim();
    }

    /**
     * 获取个性标签，","隔开，也可改为中间表
     *
     * @return tag_list - 个性标签，","隔开，也可改为中间表
     */
    public String getTagList() {
        return tagList;
    }

    /**
     * 设置个性标签，","隔开，也可改为中间表
     *
     * @param tagList 个性标签，","隔开，也可改为中间表
     */
    public void setTagList(String tagList) {
        this.tagList = tagList == null ? null : tagList.trim();
    }

    /**
     * 获取喜好美食，个性标签，","隔开，也可改为中间表
     *
     * @return food_list - 喜好美食，个性标签，","隔开，也可改为中间表
     */
    public String getFoodList() {
        return foodList;
    }

    /**
     * 设置喜好美食，个性标签，","隔开，也可改为中间表
     *
     * @param foodList 喜好美食，个性标签，","隔开，也可改为中间表
     */
    public void setFoodList(String foodList) {
        this.foodList = foodList == null ? null : foodList.trim();
    }

    /**
     * 获取个性签名
     *
     * @return sign - 个性签名
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置个性签名
     *
     * @param sign 个性签名
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取用户所在地区
     *
     * @return regn - 用户所在地区
     */
    public String getRegn() {
        return regn;
    }

    /**
     * 设置用户所在地区
     *
     * @param regn 用户所在地区
     */
    public void setRegn(String regn) {
        this.regn = regn == null ? null : regn.trim();
    }

    /**
     * 获取保证金，可用一张表比如钱包存储
     *
     * @return margin - 保证金，可用一张表比如钱包存储
     */
    public Double getMargin() {
        return margin;
    }

    /**
     * 设置保证金，可用一张表比如钱包存储
     *
     * @param margin 保证金，可用一张表比如钱包存储
     */
    public void setMargin(Double margin) {
        this.margin = margin;
    }

    /**
     * 获取是否实名制,0-否,1-是
     *
     * @return is_real_name - 是否实名制,0-否,1-是
     */
    public String getIsRealName() {
        return isRealName;
    }

    /**
     * 设置是否实名制,0-否,1-是
     *
     * @param isRealName 是否实名制,0-否,1-是
     */
    public void setIsRealName(String isRealName) {
        this.isRealName = isRealName == null ? null : isRealName.trim();
    }

    /**
     * 获取是否禁用，0-否，1-是
     *
     * @return is_del - 是否禁用，0-否，1-是
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * 设置是否禁用，0-否，1-是
     *
     * @param isDel 是否禁用，0-否，1-是
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
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