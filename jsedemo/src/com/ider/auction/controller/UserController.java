package com.ider.auction.controller;

import com.ider.auction.pojo.Users;
import com.ider.auction.service.UserService;

public class UserController {
    private UserService userService=new UserService();
    //用户注册，用户名与密码
    public String register(String uname,String password){
        String s=userService.register(uname,password);
        return s;
    }
    //用户登陆
    public String login(String uname,String password){
        String a=userService.login(uname,password);
        return a;
    }
    //账户充值
    public int recharge(int money){
        int recharge = userService.recharge(money);
        if (recharge == -1){
            System.out.println("充值失败,是否要重新充值，重新充值请输入0");
        }else {
        return recharge;
        }return 0;
    }
    //用户等级
    public String identity(String identity){
        String identity1 = userService.identity(identity);
        return identity1;
    }
}
