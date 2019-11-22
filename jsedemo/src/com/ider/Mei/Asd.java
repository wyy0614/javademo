package com.ider.Mei;
import java.util.Scanner;
public class Asd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        as(a,b);
    }
    public static void as(int x,int y){
        int c=x+y;
        int d=x-y;
        int e=x*y;
        int f=x/y;
        int g=x%y;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
