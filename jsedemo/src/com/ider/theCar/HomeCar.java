package com.ider.theCar;

public class HomeCar extends Car{
    public int num;
    public HomeCar(String color,String userName,int num){
        super(color,userName);
        this.num=num;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num=num;
    }

    public void display(){
        System.out.println(this.userName+"拥有的"+this.color+"颜色的私家车,有"+this.num+"座位");
    }
    public void display(int num){
        System.out.println("家用汽车大多有"+num+"个座位");
    }
}
