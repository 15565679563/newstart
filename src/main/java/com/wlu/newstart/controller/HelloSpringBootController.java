package com.wlu.newstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个测试接口
 *
 * @author: wlu
 * @created: 2021/04/07 22:26
 */

@RestController
@RequestMapping("/api/start")
public class HelloSpringBootController {


    @GetMapping("/hello")
    public String helloSpringBoot(){
        return "Hello Spring Boot";
    }

}
