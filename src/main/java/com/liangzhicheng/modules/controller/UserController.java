package com.liangzhicheng.modules.controller;

import com.liangzhicheng.modules.entity.User;
import com.liangzhicheng.modules.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @PostMapping(value = "/list")
    public List<User> list(){
        return userService.list();
    }

}
