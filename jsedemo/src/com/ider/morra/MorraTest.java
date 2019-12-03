package com.ider.morra;
import com.ider.morra.controller.UserController;

import java.util.Scanner;
public class MorraTest {
    public static void main(String[] args) {
        //用户注册
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎来到注册页");
        System.out.println("请输入用户名：");
        String uname=sc.next();
        System.out.println("请输入密码：");
        String password=sc.next();
        UserController userController=new UserController();
        String register = userController.register(uname,password);
        System.out.println(register);


        //用户登陆
        System.out.println("欢迎来到登录页");
        System.out.println("请输入用户名：");
        String uname2=sc.next();
        System.out.println("请输入密码：");
        String password2=sc.next();
        String login = userController.login(uname2,password2);
        System.out.println(login);

        //用户注销

    }

}
