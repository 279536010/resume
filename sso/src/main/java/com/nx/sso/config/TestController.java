package com.nx.sso.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
@RefreshScope
public class TestController {

    @Value("${app.id}")
    private Integer id;

    /**
     * http://localhost:8080/config/get
     */
    @RequestMapping("/get")
    public Integer get() {
        return id;
    }

    @GetMapping("/oauth/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
