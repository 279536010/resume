package com.nx.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nx.dto.UserDto;
import com.nx.user.converter.UserConverter;
import com.nx.user.entity.User;
import com.nx.user.mapper.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuwei
 * @description
 * @date 2019/11/26 10:31 上午
 **/
@Service
@AllArgsConstructor
public class UserService extends ServiceImpl<UserDao, User> {
    private final UserDao userDao;
    private final UserConverter userConverter;

    public UserDto getDtoById(Integer id) {
        User byId = this.getById(id);
        return userConverter.entityToDto(byId);
    }
}
