package com.cmc.cas.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 认证中心统一用户
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ca_common_user_")
public class CaCommonUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 雪花id
     */
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户名称(非账号,显示用)
     */
    @TableField("user_name_")
    private String userName;

    /**
     * 用户账号
     */
    @TableField("account_")
    private String account;

    /**
     * 密码
     */
    @TableField("password_")
    private String password;

    /**
     * 用户手机号,可为空
     */
    @TableField("phone_")
    private String phone;

    /**
     * 邮箱 可为空
     */
    @TableField("email_")
    private String email;

    /**
     * 头像地址
     */
    @TableField("avatar_url_")
    private String avatarUrl;

    /**
     * 账号激活状态 0-正常 1-未激活
     */
    @TableField("status_")
    private Integer status;


    public static final String ID_ = "id_";

    public static final String USER_NAME_ = "user_name_";

    public static final String ACCOUNT_ = "account_";

    public static final String PASSWORD_ = "password_";

    public static final String PHONE_ = "phone_";

    public static final String EMAIL_ = "email_";

    public static final String AVATAR_URL_ = "avatar_url_";

    public static final String STATUS_ = "status_";



}
