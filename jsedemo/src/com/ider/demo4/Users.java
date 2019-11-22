package com.ider.demo4;

public class Users {
    private String userName;
    private String password;

    public String getuserName(){
        return this.userName;
    }
    public void setuserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String show(){
        String s="userName:"+this.userName+"password:"+this.password;
        return s;
    }

}
