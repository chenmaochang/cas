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
 * 认证中心用户组
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ca_common_group_")
public class CaCommonGroup extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 自增主键id
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户组名称(显示用)
     */
    @TableField("group_name_")
    private String groupName;

    /**
     * 父用户组id
     */
    @TableField("parent_group_id_")
    private String parentGroupId;

    /**
     * 路径 id_id2_id3_
     */
    @TableField("path_")
    private String path;

    /**
     * 状态 0-正常 1-停用
     */
    @TableField("status_")
    private Integer status;


    public static final String ID_ = "id_";

    public static final String GROUP_NAME_ = "group_name_";

    public static final String PARENT_GROUP_ID_ = "parent_group_id_";

    public static final String PATH_ = "path_";

    public static final String STATUS_ = "status_";

}
