package com.ider.morra.controller;

import com.ider.morra.service.UserService;

public class UserController {
    private UserService userService=new UserService();
    //用户注册
    public String register(String uname,String password){
        String register = userService.register(uname,password);
        return register;
    }
    //用户登陆
    public String login(String uname,String password){
        String login = userService.login(uname,password);
        return login;
    }
    //用户注销

}
