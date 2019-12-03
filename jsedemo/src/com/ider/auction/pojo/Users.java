package com.ider.auction.pojo;

public class Users {
    private String uname;
    private String password;
    private int money;
    private String identity;
    private String bag;

    public String getUname(){
        return this.uname;
    }
    public void setUname(String uname){
        this.uname=uname;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money=money;
    }
    private String getIdentity(){
        return identity;
    }
    private void setIdentity(String identity){
        this.identity=identity;
    }

    public String getBag() {
        return bag;
    }

    public void setBag(String bag) {
        this.bag = bag;
    }
}
