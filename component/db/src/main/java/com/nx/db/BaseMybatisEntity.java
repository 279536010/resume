package com.nx.db;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 基础Mybatis模型
 *
 * @author xw
 * @date 2019/10/9 14:52
 */
@Getter
@Setter
public class BaseMybatisEntity implements Serializable {
    /**
     * 删除标识
     */
    @TableLogic
    protected boolean deleted;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime gmtCreate;
    /**
     * 修改时间
     */
    @TableField(select = false, fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;

}
