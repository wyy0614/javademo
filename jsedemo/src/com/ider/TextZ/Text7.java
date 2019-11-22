package com.ider.TextZ;

public class Text7 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=false;
        boolean d=true;
        boolean e=a&b&c&d;
        boolean f=a&b|d;
        boolean g=a&b|c&d;
        boolean h=a||b|c&d;
        System.out.println("本次投票的结果为："+e);
        System.out.println("本次投票的结果为："+f);
        System.out.println("本次投票的结果为："+g);
        System.out.println("本次投票的结果为："+h);


    }
}
