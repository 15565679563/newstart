package com.wlu.newstart.controller;

import com.wlu.newstart.entity.Result;
import com.wlu.newstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 用户接口，用于暴露对外接口
 *
 * @author: wlu
 * @created: 2021/04/13 10:38
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Result<Object> addUser(@RequestParam("userName") String userName,
                                              @RequestParam("loginId") String loginId,
                                              @RequestParam("password") String password,
                                              @RequestParam("tel") int tel){
        try {
            userService.addUser(userName, loginId, password, tel);
            return Result.success("添加成功");
        }catch (Exception e){
            return Result.fail("接口错误");
        }

    }
}
