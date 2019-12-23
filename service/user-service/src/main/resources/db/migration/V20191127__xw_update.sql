CREATE TABLE `t_user_role`
(
    `id`           int(11)     NOT NULL AUTO_INCREMENT,
    `user_id`      int(0)      NULL,
    `role`         varchar(64) NULL,
    `is_delete`    tinyint(1)  NOT NULL DEFAULT 0,
    `gmt_create`   datetime(0) NOT NULL,
    `gmt_modified` datetime(0) NULL     DEFAULT NULL,
    PRIMARY KEY (`id`)
);