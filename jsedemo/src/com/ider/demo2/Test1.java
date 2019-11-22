package com.ider.demo2;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        准备开店
        Bag b1=new Bag();
        Bag b2=new Bag();
        Bag b3=new Bag();
//        定义商品属性
        b1.sname="单肩包";
        b1.sc=10;
        b1.scolor='红';

        b2.sname="双肩包";
        b2.sc=11;
        b2.scolor='黄';

        b3.sname="斜跨包";
        b3.sc=12;
        b3.scolor='蓝';
//        准备货架
        Bag[] arr=new Bag[5];
        arr[0]=b1;
        arr[1]=b2;
        arr[2]=b3;
//        开店
        System.out.println("--------------");
        System.out.println("欢迎光临 希望您购物愉快");
//        展示商品信息
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println("商品序号:"+i+"\t"+"商品名称:"+arr[i].sname+"\t"+"商品容量:"+arr[i].sc+"\t"+"商品颜色:"+arr[i].scolor);
            }
        }
//        顾客选购商品
        for(int m=1;m==1;){
            System.out.println("================");
            System.out.println("请输入您选择的商品序号:");
            int a=sc.nextInt();
            if(a<arr.length&&a>=0){
                System.out.println("商品序号:"+a+"\t"+"商品名称:"+arr[a].sname+"\t"+"商品容量:"+arr[a].sc+"\t"+"商品颜色:"+arr[a].scolor);
            }
            else {
                System.out.println("您输入的商品"+a+"不存在");
            }
            System.out.println("是否还要继续选择？1继续，0继续");
            m=sc.nextInt();
        }

    }
}
