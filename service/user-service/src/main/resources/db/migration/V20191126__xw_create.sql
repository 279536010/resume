CREATE TABLE `t_user`
(
    `id`                int(11)      NOT NULL   AUTO_INCREMENT,
    `username`          varchar(255) NOT NULL                    COMMENT '账号',
    `real_name`         varchar(255) NULL                        COMMENT '真实名称',
    `password`          varchar(255) NULL                        COMMENT '密码',
    `phone`             varchar(64)  NULL                        COMMENT '手机',
    `email`             varchar(255) NULL                        COMMENT '邮箱',
    `address`           varchar(255) NULL                        COMMENT '地址',
    `description`       varchar(255) NULL                        COMMENT '描述',
    `sex`               varchar(12)  NULL                        COMMENT '性别',
    `birthday`          varchar(12)  NULL                        COMMENT '生日',
    `salary`            varchar(12)  NULL                        COMMENT '薪水',
    `hope_company`      text(0)      NULL                        COMMENT '期望公司',
    `personal_planning` text(0)      NULL                        COMMENT '个人规划',
    `salary`            varchar(12)  NULL                        COMMENT '薪水',
    `is_delete`         tinyint(1)   NOT NULL   DEFAULT 0        COMMENT '是否删除',
    `gmt_create`        datetime(0)  NOT NULL                    COMMENT '创建时间',
    `gmt_modified`      datetime(0)  NULL       DEFAULT NULL     COMMENT '修改时间',
    PRIMARY KEY (`id`)
);