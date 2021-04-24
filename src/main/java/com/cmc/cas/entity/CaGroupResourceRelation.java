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
 * 认证中心资源组关系表
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ca_group_resource_relation_")
public class CaGroupResourceRelation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 雪花id
     */
    @TableId(value = "id_", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 资源表id ca_resource_ 表主键
     */
    @TableField("resource_id_")
    private Integer resourceId;

    /**
     * 冗余字段 资源表id ca_resource_ 表resource_name_
     */
    @TableField("resource_name_")
    private String resourceName;

    /**
     * 冗余字段用户组ca_common_group_ group_name_
     */
    @TableField("group_name_")
    private String groupName;

    /**
     * 用户组ca_common_group_ 主键
     */
    @TableField("group_id_")
    private Integer groupId;


    public static final String ID_ = "id_";

    public static final String RESOURCE_ID_ = "resource_id_";

    public static final String RESOURCE_NAME_ = "resource_name_";

    public static final String GROUP_NAME_ = "group_name_";

    public static final String GROUP_ID_ = "group_id_";

}
