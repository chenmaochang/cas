package com.cmc.cas.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ca_common_user_")
public class CaCommonUser implements Serializable {

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


    public static final String ID_ = "id_";

    public static final String USER_NAME_ = "user_name_";

}
