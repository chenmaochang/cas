package com.cmc.cas.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.cmc.cas.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ca_register_history_")
public class CaRegisterHistory extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 雪花id
     */
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户表ca_common_user_主键
     */
    @TableField("user_id_")
    private Long userId;

    /**
     * 冗余字段-用户表ca_common_user_  user_name字段
     */
    @TableField("user_name_")
    private String userName;

    /**
     * 注册时ip
     */
    @TableField("register_ip_")
    private String registerIp;

    /**
     * 注册设备信息
     */
    @TableField("register_device_")
    private String registerDevice;


    public static final String ID_ = "id_";

    public static final String USER_ID_ = "user_id_";

    public static final String USER_NAME_ = "user_name_";

    public static final String REGISTER_IP_ = "register_ip_";

    public static final String REGISTER_DEVICE_ = "register_device_";

}
