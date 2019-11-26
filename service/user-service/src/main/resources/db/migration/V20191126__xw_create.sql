CREATE TABLE `t_user`
(
    `id`           int(11)      NOT NULL AUTO_INCREMENT,
    `username`     varchar(255) NOT NULL,
    `password`     varchar(255) NULL,
    `phone`        varchar(255) NULL,
    `email`        varchar(255) NULL,
    `is_delete`    tinyint(1)   NOT NULL DEFAULT 0,
    `gmt_create`   datetime(0)  NOT NULL,
    `gmt_modified` datetime(0)  NULL     DEFAULT NULL,
    PRIMARY KEY (`id`)
);