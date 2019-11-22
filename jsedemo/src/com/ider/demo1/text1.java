package com.ider.demo1;

import java.util.Scanner;
public class text1 {
    public static void main(String[] arges){
        Scanner sc=new Scanner(System.in);

        for(int i=1;i==1;)
        {
            System.out.println("-------------");
            System.out.println("请输入一个数字：");
            int a=sc.nextInt();
            if(a%2==0){
                System.out.println("这个数是偶数");
            }
            else{
                System.out.println("这个数是奇数");
            }
            System.out.println("是否继续输入数字");
            System.out.println("输入1代表继续");
            System.out.println("输入0代表不继续");
            i=sc.nextInt();

        }

    }
}
