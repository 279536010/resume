package com.nx.user.entity;

import com.nx.db.BaseMybatisEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * t_user
 *
 * @author xw
 */
@Getter
@Setter
public class User extends BaseMybatisEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
}