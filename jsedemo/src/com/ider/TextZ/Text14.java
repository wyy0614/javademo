package com.ider.TextZ;

public class Text14 {
    public static void main(String[] args) {
        int age=25;
        if(age>60){
            System.out.println("老年");
        }
        else if(age>40&age<61){
            System.out.println("中年");
        }
        else if(age>18&age<41){
            System.out.println("少年");
        }
        else {
            System.out.println("童年");
        }
    }
}
