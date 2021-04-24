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
 * 认证中心资源表
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("ca_resource_")
public class CaResource extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;

    /**
     * 资源名称(显示用)
     */
    @TableField("resource_name_")
    private String resourceName;

    /**
     * 资源类型
     */
    @TableField("resource_type_")
    private Integer resourceType;

    /**
     * 资源状态 0-正常 1-停用
     */
    @TableField("status_")
    private Integer status;

    /**
     * 资源等级
     */
    @TableField("resource_level_")
    private Integer resourceLevel;


    public static final String ID_ = "id_";

    public static final String RESOURCE_NAME_ = "resource_name_";

    public static final String RESOURCE_TYPE_ = "resource_type_";

    public static final String STATUS_ = "status_";

    public static final String RESOURCE_LEVEL_ = "resource_level_";

}
