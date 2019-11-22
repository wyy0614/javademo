package com.ider.Mei;
import java.util.Scanner;
public class SuShu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1||a==2){
            System.out.println("这是一个素数");
        }
       int num=0,i;
        for(i=1;i<=a;i++){
            if(a%i==0){
            num++;
        }}
        if(num==2){
            System.out.println("这是一个素数");
        }
        else{
            System.out.println("这不是一个素数");
        }
    }

}
