package com.nx.api.user;

import com.nx.dto.UserDto;

/**
 * @author xuwei
 * @description
 * @date 2019/11/26 1:53 下午
 **/
public class UserFallback implements UserClient {
    @Override
    public UserDto get(Integer id) {
        return new UserDto();
    }

    @Override
    public UserDto getByUsername(String username) {
        return new UserDto();
    }
}
