package com.ider.TextZ;
import java.util.Scanner;
public class Text8 {
    public static void main(String[] args) {
       int num=999;
       int count=0;
     Scanner sc=new Scanner(System.in);
     long a=sc.nextInt();
        int i = 1;
        while (a>=10){
            i++;
            a=a/10;
        }
        System.out.println(i+"位数");
    }
}
