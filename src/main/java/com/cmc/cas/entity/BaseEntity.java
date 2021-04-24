package com.cmc.cas.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseEntity implements Serializable {
    /**
     * 创建者id 0-系统 其他为本表id
     */
    @TableField("creator_id_")
    private Long creatorId;

    /**
     * 修改者id 0-系统 其他为本表id
     */
    @TableField("updater_id_")
    private Long updaterId;

    /**
     * 创建时间
     */
    @TableField("create_time_")
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    @TableField("update_time_")
    private LocalDateTime updateTime;

    /**
     * 删除标记0-未删除 1-已删除
     */
    @TableField("delete_flag_")
    private Integer deleteFlag;

    /**
     * 删除序号,记下主键
     */
    @TableField("delete_flag_no_")
    private Long deleteFlagNo;
    public static final String CREATOR_ID_ = "creator_id_";

    public static final String UPDATER_ID_ = "updater_id_";

    public static final String CREATE_TIME_ = "create_time_";

    public static final String UPDATE_TIME_ = "update_time_";

    public static final String DELETE_FLAG_ = "delete_flag_";

    public static final String DELETE_FLAG_NO_ = "delete_flag_no_";
}
