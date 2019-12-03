package com.ider.morra.service;

import com.ider.morra.Dao.UserDao;
import com.ider.morra.pojo.User;

public class UserService {
    private UserDao userDao=new UserDao();
    //用户注册
    public String register(String uname,String password){
        //非空判断
        if(uname==null&&password==null){
            return null;
        }
        //查看用户是否已经注册
        User user = userDao.seleceByUser(uname);
        if(user!=null){
            return "该用户已注册";
        }
        //注册用户，将用户信息存储在数组中
        User u=new User();
        u.setUname(uname);
        u.setPassword(password);

        int i = userDao.addOne(u);
        if(i==1){
            return "用户注册成功";
        }
        return "用户注册失败";
    }

    //用户登陆
    public String login(String uname,String password){
        User u=new User();
        u.setUname(uname);
        u.setPassword(password);
        int login = userDao.login(uname,password);
        if(login==1){
            return "登陆成功";
        }
        return  "登陆失败,请重新登陆";
    }


}
