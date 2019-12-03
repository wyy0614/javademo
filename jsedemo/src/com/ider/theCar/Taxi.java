package com.ider.theCar;

public class Taxi extends Car {
    public String company;
    public Taxi(String userName,String color,String company){
        super(userName,color);
        this.company=company;
    }
    public String getCompany(){
        return this.company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public final void ride(){
        System.out.println(this.userName+"出租车是所属于在"+this.company+"的");
    }
    public  void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }
    public  String  toString(){
        return "taxi的信息是："+this.userName+"拥有一辆"+this.color+"的出租车";
    }

}
