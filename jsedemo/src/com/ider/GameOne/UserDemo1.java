package com.ider.GameOne;
import java.util.Scanner;
public class UserDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User []uarr= new User[20];

        Data[] data=new Data[36];
        Data d=new Data("生肖","鼠","上官");
        data[0]=d;
        Data d2=new Data("生肖","牛","浴");
        data[1]=d2;
        Data d3=new Data("生肖","虎","玉");
        data[2]=d3;
        Data d4=new Data("生肖","兔","陌");
        data[3]=d4;
        Data d5=new Data("生肖","龙","夜");
        data[4]=d5;
        Data d6=new Data("生肖","蛇","陆");
        data[5]=d6;
        Data d7=new Data("生肖","马","顾");
        data[6]=d7;
        Data d8=new Data("生肖","羊","夏");
        data[7]=d8;
        Data d9=new Data("生肖","猴","楚");
        data[8]=d9;
        Data d10=new Data("生肖","鸡","苏");
        data[9]=d10;
        Data d11=new Data("生肖","狗","程");
        data[10]=d11;
        Data d12=new Data("生肖","猪","慕");
        data[11]=d12;


        Data d13=new Data("月份","1","小");
        data[12]=d13;
        Data d14=new Data("月份","2","棂");
        data[13]=d14;
        Data d15=new Data("月份","3","玥");
        data[14]=d15;
        Data d16=new Data("月份","4","浅");
        data[15]=d16;
        Data d17=new Data("月份","5","瑾");
        data[16]=d17;
        Data d18=new Data("月份","6","颜");
        data[17]=d18;
        Data d19=new Data("月份","7","曦");
        data[18]=d19;
        Data d20=new Data("月份","8","夭");
        data[19]=d20;
        Data d21=new Data("月份","9","眠");
        data[20]=d21;
        Data d22=new Data("月份","10","晴");
        data[21]=d22;
        Data d23=new Data("月份","11","莹");
        data[22]=d23;
        Data d24=new Data("月份","12","瑶");
        data[23]=d24;


        Data d25=new Data("星座","白羊座","浅");
        data[24]=d25;
        Data d26=new Data("星座","金牛座","姬");
        data[25]=d26;
        Data d27=new Data("星座","双子座","儿");
        data[26]=d27;
        Data d28=new Data("星座","巨蟹座","盈");
        data[27]=d28;
        Data d29=new Data("星座","狮子座","衣");
        data[28]=d29;
        Data d30=new Data("星座","处女座","仪");
        data[29]=d30;
        Data d31=new Data("星座","天秤座","之");
        data[30]=d31;
        Data d32=new Data("星座","天蝎座","晞");
        data[31]=d32;
        Data d33=new Data("星座","射手座","璃");
        data[32]=d33;
        Data d34=new Data("星座","摩羯座","蓉");
        data[33]=d34;
        Data d35=new Data("星座","水瓶座","色");
        data[34]=d35;
        Data d36=new Data("星座","双鱼座","绯");
        data[35]=d36;





        String uname=sc.next();
        int psd=sc.nextInt();
        String sx=sc.next();
        int month=sc.nextInt();
        String xz=sc.next();

//        用户注册
        int n= register(uname,psd,sx,month,xz,uarr);
        if(n==1){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
//        用户登陆
        System.out.println("请输入你的用户名及密码");
        String uname2=sc.next();
        int psd2=sc.nextInt();
        int m=login(uname2,psd2,uarr);
        if(m==1){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
//        开始测试
        System.out.println("请输入你的生肖，出生月份，星座");
        String sx2=sc.next();
        String month2=sc.next();
        String xz2=sc.next();
        String newName=startGame(sx2,month2,xz2,data);
        System.out.println("你前世的名字是:"+newName);
    }
//    用户注册
    public static int register(String uname,int psd,String sx,int month,String xz,User[] ua){
        User u=new User();
        u.uname=uname;
        u.psd=psd;
        u.sx=sx;
        u.month=month;
        u.xz=xz;
        for(int i=0;i<ua.length;i++){
            if(ua[i]==null){
                ua[i]=u;
                return 1;
            }
        }
        return -1;

    }
//    用户登陆
    public static int login(String uname,int psd,User[] ua){
        for(int i=0;i<ua.length;i++){
            if(ua[i]!=null){
                if(ua[i].uname.equals(uname)&&ua[i].psd==psd){
                    return 1;
                }
            }
        }
        return -1;
    }
//    开始测试
    public static String startGame(String sx,String month,String xz,Data[]ds){
    String newName="";
    for(int i=0;i<ds.length;i++){
        if(ds[i]!=null){
            if(ds[i].sj.equals("生肖")){
                if(ds[i].ys.equals(sx)){
                    newName=newName+ds[i].xz;
                }
            }
            if(ds[i].sj.equals("月份")){
                if(ds[i].ys.equals(month)){
                    newName=newName+ds[i].xz;
                }
            }
            if(ds[i].sj.equals("星座")){
                if(ds[i].ys.equals(xz)){
                    newName=newName+ds[i].xz;
                }
            }

        }
    }
    return newName;
    }
}