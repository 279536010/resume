package com.nx.sso.service;

import com.nx.api.user.UserClient;
import com.nx.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author xuwei
 * @description
 * @date 2019/11/26 11:43 上午
 **/
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private final UserClient userClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = userClient.getByUsername(username);
        return null;
    }
}
