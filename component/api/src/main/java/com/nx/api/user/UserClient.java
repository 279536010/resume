package com.nx.api.user;

import com.nx.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuwei
 * @description
 * @date 2019/11/26 1:51 下午
 **/
@FeignClient(value = "user-service", decode404 = true, fallback = UserFallback.class)
public interface UserClient {

    @GetMapping("user/{id}")
    UserDto get(@PathVariable Integer id);

    @GetMapping("user}")
    UserDto getByUsername(String username);
}
