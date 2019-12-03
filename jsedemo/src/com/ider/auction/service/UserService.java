package com.ider.auction.service;

import com.ider.auction.dao.UserDao;
import com.ider.auction.pojo.Users;

public class UserService {
    private UserDao userDao=new UserDao();
    public String register(String uname,String password){
        //参数非空判断
        if(uname==null&&password==null){
            return null;
        }
        //查看当前注册用户是否已经注册
        Users users = userDao.selectByUname(uname);
        if(users!=null){
            return "用户名已存在";
        }
        //注册用户，将信息存储起来
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(password);
        int a=userDao.addOne(u);
        if(a<=0){
            return "用户注册失败";
        }
        return "用户注册成功";
    }
    //用户登陆

    public String login(String uname,String password){
        Users u=new Users();
        u.setUname(uname);
        u.setPassword(password);
        int b=userDao.compare(uname,password);
        if(b==1){
            return "登录成功";
        }
        return "登录失败,输入0重新登录";
    }
    //用户充值
    public int recharge(int money){
        //初始金额为0

        int i = userDao.initialAmount(money);
        if(i != -1){
            return i;
        }return -1;
    }
//用户等级
    public String identity(String id){
        String identity = userDao.identity(id);
        return identity;
    }



}
