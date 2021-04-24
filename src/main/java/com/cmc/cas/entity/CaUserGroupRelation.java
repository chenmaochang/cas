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
 * 认证中心用户-组 关系表
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ca_user_group_relation_")
public class CaUserGroupRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 雪花id
     */
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id ca_common_user_ 表主键
     */
    @TableField("user_id_")
    private Long userId;

    /**
     * 冗余字段 用户名称(非账号,显示用)
     */
    @TableField("user_name_")
    private String userName;

    /**
     * 冗余字段 用户组ca_common_group_ group_name_
     */
    @TableField("group_name_")
    private String groupName;

    /**
     * 用户组ca_common_group_ 主键
     */
    @TableField("group_id_")
    private Integer groupId;


    public static final String ID_ = "id_";

    public static final String USER_ID_ = "user_id_";

    public static final String USER_NAME_ = "user_name_";

    public static final String GROUP_NAME_ = "group_name_";

    public static final String GROUP_ID_ = "group_id_";

}
