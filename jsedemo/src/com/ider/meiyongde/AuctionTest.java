package com.ider.meiyongde;

import com.ider.meiyongde.basicInf.*;
import com.ider.meiyongde.util.SceneUtils;

import java.util.Scanner;
public class AuctionTest {
    //初始化
    static Userinfo[]userinfos;//存放用户数组
    static Userinfo us;
    static AuctionItem[]auctionItems;//存放拍卖商品数组
    static ShoppingCart[]shoppingCarts;//购物车数组
    static Storeroom[]storerooms;//百宝囊数组
    static Money[]monies;//钱包数组
    static {
        userinfos=new  Userinfo[1000];
        auctionItems=new AuctionItem[10];
        shoppingCarts=new ShoppingCart[10];
        storerooms=new Storeroom[50];
        monies=new Money[100];
    }
    public static void main(String[] args) {
        //键盘录入信息
        Scanner sc=new Scanner(System.in);
        int m=0;
        int un=0;
        while (m!=9){
            SceneUtils.home(us);
            m=sc.nextInt();
          switch (m){
              case 1:
                  System.out.println("请输入您的用户名：");
                  String uname=sc.next();
                  System.out.println("请输入您的密码：");
                  String password=sc.next();
                  un=register(uname,password,userinfos);
                  if(un==1){
                      System.out.println("恭喜您注册成功，登陆便可以进入拍卖场");
                  }else {
                      System.out.println("注册失败请重新注册");
                  }
                  break;
              case 2:
                  System.out.println("请输入您的用户名：");
                  String uname2=sc.next();
                  System.out.println("请输入您的密码：");
                  String password2=sc.next();
                  us=login(uname2,password2,userinfos);
                  if(us!=null){
                      SceneUtils.actionHome(us);
                  }else {
                      System.out.println("该用户还没有注册，请先注册！");
                  }
                  break;
              case 9:
                  return;
          }

        }

    }
//    用户注册
    public static int register(String uname,String password,Userinfo[]userinfos){
        Userinfo userinfo=new Userinfo();
        userinfo.setUname(uname);
        userinfo.setPassword(password);
        int a=userExist(userinfo,userinfos);
        if(a==1){
          for (int j=0;j<userinfos.length;j++){
              if(userinfos[j]==null){
                  userinfos[j]=userinfo;
                  return a;
              }
          }
        }
        return a;
    }
    public static int userExist(Userinfo us,Userinfo[]userinfos){
        for (int i=0;i<userinfos.length;i++){
            if(userinfos[i]!=null){
                if(! userinfos[i].getUname().equals(us.getUname())){
                    return 1;
                }
            }else if(i==userinfos.length-1){
                return 1;
            }
        }
        return -1;
    }
//用户登陆
    public static Userinfo login(String uname,String password,Userinfo[]userinfos){
        for (int i=0;i<userinfos.length;i++){
            if(userinfos[i]!=null){
                if(userinfos[i].getUname().equals(uname)&&userinfos[i].getPassword().equals(password)){
                  return userinfos[i];
                }
            }
        }
        return null;
    }



}
