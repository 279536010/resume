CREATE TABLE `t_user_experience`
(
    `id`           int(11)      NOT NULL    AUTO_INCREMENT,
    `user_id`      int(11)      NOT NULL                        COMMENT '关联用户id',
    `content`      text(0)      NULL                            COMMENT '内容',
    `is_show`      tinyint(1)   NOT NULL    DEFAULT 0           COMMENT '是否显示',
    `is_delete`    tinyint(1)   NOT NULL    DEFAULT 0           COMMENT '是否删除',
    `gmt_create`   datetime(0)  NOT NULL                        COMMENT '创建时间',
    `gmt_modified` datetime(0)  NULL        DEFAULT NULL        COMMENT '修改时间',
    PRIMARY KEY (`id`)
);
