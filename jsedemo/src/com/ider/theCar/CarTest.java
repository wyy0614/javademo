package com.ider.theCar;
import java.util.Scanner;
public class CarTest {
    public CarTest(){}

    public static void main(String[] args) {

        Car c=new Car();
        c.use();
        Car car1=new Car("red","zhang");
        Car car2=new Car("red","zhang");
        boolean a=car1.equals(car2);
        System.out.println("car1和car2的引用比较："+a);
        System.out.println("==================================");
        Car taxi=new Taxi("蓝色","张小泉","长生公司");
        ((Taxi) taxi).ride();
        taxi.use();
        String b=taxi.toString();
        System.out.println(b);
        System.out.println("==================================");
        Car homecar=new HomeCar("紫色","孙二娘",7);
        ((HomeCar)homecar).display();
        ((HomeCar)homecar).display(5);
    }


}

