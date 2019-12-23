package com.nx.user.controller;

import com.nx.dto.UserDto;
import com.nx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @description
 * @date 2019/11/26 10:37 上午
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable Integer id) {
        return userService.getDtoById(id);
    }
}
