package com.ider.auction.pojo;

public class AuctionItem {
    public String aname;
    public String information;
    public int money;
    public AuctionItem(){

    }
    public AuctionItem (String aname,String information,int money){
        this.aname=aname;
        this.information=information;
        this.money=money;
    }
    public String getAname(){
        return aname;
    }
    public void setAname(String aname){
        this.aname=aname;
    }
    public String getInformation(){
        return information;
    }
    public void setInformation(String information){
        this.information=information;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
