package com.nx.service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @description
 * @date 2019/11/13 11:05 下午
 **/
@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String test() {
        return "hello";
    }

    @GetMapping("hi")
    public String test2() {
        return "hello";
    }
}
