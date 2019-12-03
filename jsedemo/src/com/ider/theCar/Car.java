package com.ider.theCar;

public class Car {
    public String color;
    public String userName;


    public static void car(String color,String userName){

    }
    public Car(){}
    public  void use(){
        System.out.println("我是机动车!");
    }
    public Car(String color,String userName){
        this.userName=userName;
        this.color=color;
    }

    public boolean equals(Object ob){
        //自反性
        if(this==ob){
            return true;
        }
        //instanceof比较判断是否是同一类或者子父类关系
        if(!(ob instanceof Car)){
            return false;
        }
        //判断是同一类或者子父类关系，再将Object类型强转为Students
        Car ob1=(Car)ob;
//        if(this.color==ob1.color&&this.userName==ob1.userName)
        if(ob1.color.equals(color)&&ob1.userName.equals(userName))
        {
            return true;
        }else {
            return false;
        }
    }

    public String toString(){
        return null;
    }
}
