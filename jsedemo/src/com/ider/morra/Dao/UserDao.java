package com.ider.morra.Dao;

import com.ider.morra.pojo.User;

public class UserDao {
    private static User[] user;
    static {
        user=new User[10];
    }
    //根据用户名查找是否有相同的用户名
    public User seleceByUser(String uname){
        for (int i = 0; i < user.length; i++) {
            if(user[i]!=null){
                if(user[i].getUname().equals(uname)){
                    return user[i];
                }
            }
        }
        return null;
    }
    //注册用户，将用户信息放入数组中
    public int addOne(User u){
        for (int i = 0; i < user.length; i++) {
            if(user[i]==null){
                user[i]=u;
                return 1;
            }
        }
        return 0;
    }
    //用户登陆
    public int login(String uname,String password){
        for (int i = 0; i < user.length; i++) {
            if(user[i]!=null){
                if(user[i].getUname().equals(uname)&&user[i].getPassword().equals(password)){
                    return 1;
                }
            }
        }
        return -1;
    }
}
