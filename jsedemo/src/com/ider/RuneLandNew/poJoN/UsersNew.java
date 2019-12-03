package com.ider.RuneLandNew.poJoN;

public class UsersNew {
    private String uname;
    private String password;
    private final EpigraphNew[] EPI=new EpigraphNew[31];

    public String getUname(){
        return this.uname;
    }
    public void setUname(String uname){
        this.uname=uname;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public EpigraphNew[]getEPI(){
        return EPI;
    }
}
