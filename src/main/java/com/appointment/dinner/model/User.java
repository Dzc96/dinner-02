package com.appointment.dinner.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "User")
@Data
public class User {
    /**
     * 自增主键id
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private double margin;

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

}