package com.ider.auction.dao;

import com.ider.auction.pojo.AuctionItem;
import com.ider.auction.pojo.Users;

import java.util.Scanner;
public class AuctionItemDao {
    UserDao userDao=new UserDao();
    Scanner sc = new Scanner(System.in);
    private static AuctionItem[]auctionItems;
    private static AuctionItem[]car;
    private static int[]arr;

    static {
        auctionItems=new AuctionItem[10];
        car=new AuctionItem[10];
        arr=new int[1];

    }

    public void information(){
        AuctionItem a=new AuctionItem("魔法石","将自身积分消耗转移给指定人",100);
        auctionItems[0]=a;
        AuctionItem a2=new AuctionItem("奇迹石","恢复10积分",20);
        auctionItems[1]=a2;
        AuctionItem a3=new AuctionItem("发掘潜力灵丹","寻求队友帮助且不消耗积分",40);
        auctionItems[2]=a3;
        AuctionItem a4=new AuctionItem("不虚此行灵丹","吃掉此丹药，移动速度加成100%",120);
        auctionItems[3]=a4;
        AuctionItem a5=new AuctionItem("水晶之石","抵消一次积分消耗",500);
        auctionItems[4]=a5;
        AuctionItem a6=new AuctionItem("幽冥鬼火","此异火：焰芯拥有焚烧万物的温度，但接近此异火会感到痛彻身心的极致冰寒",2000);
        auctionItems[5]=a6;
        AuctionItem a7=new AuctionItem("暴雨梨花针","瞬间发出万万的针雨，穿破一切的阻碍",1500);
        auctionItems[6]=a7;
        AuctionItem a8=new AuctionItem("长生丹","吃下去获得100年寿命",10000);
        auctionItems[7]=a8;
        AuctionItem a9=new AuctionItem("复活丹","给（刚死亡一天之内并魂魄尚在）亡者吃下会复活",30000);
        auctionItems[8]=a9;
        AuctionItem a10=new AuctionItem("超复活石","给（没有限制）亡者吃下会复活",300000);
        auctionItems[9]=a10;
        for (int i = 0; i < auctionItems.length; i++) {
            if(auctionItems[i]!=null)
                System.out.println("商品序号："+i+"\n商品名称："+auctionItems[i].aname+"\n商品详情："+auctionItems[i].information+"\n商品价格"+auctionItems[i].money);
                System.out.println("---------");
        }
    }
    //输入商品序号展示商品信息
    public void selectByAuctionItem(int x){
        if (x >= 0 && x < auctionItems.length) {
            System.out.println("商品序号：" + x + "\n商品名称：" + auctionItems[x].aname + "\n商品详情：" + auctionItems[x].information + "\n商品价格" + auctionItems[x].money);
        }
        else {
            System.out.println("您输入的商品"+x+"不存在");
        }
    }
    //输入商品名称展示商品信息
    public void selectByAuctionItemname(String aname){
        for (int i = 0; i < auctionItems.length; i++) {
            if(auctionItems[i]!=null){
                if(aname.equals(auctionItems[i].aname)){
                    System.out.println("商品序号：" + i + "\n商品名称：" + auctionItems[i].aname + "\n商品详情：" + auctionItems[i].information + "\n商品价格" + auctionItems[i].money);
                }
            }
        }
    }
    //排行榜信息
    public void sort(){
        if(auctionItems==null||auctionItems.length<2){
            return;
        }
        for (int i = 0; i < auctionItems.length; i++) {
            for(int j=0;j<auctionItems.length-i-1;j++){
                if(auctionItems[j].money<auctionItems[j+1].money){
                    AuctionItem temp=auctionItems[j];
                    auctionItems[j]=auctionItems[j+1];
                    auctionItems[j+1]=temp;
                }

            }
        }
        for(int i=0;i < auctionItems.length; i++){
            System.out.println("排行榜信息为：");
            System.out.println("商品序号：" + i + "\n商品名称：" + auctionItems[i].aname + "\n商品详情：" + auctionItems[i].information + "\n商品价格" + auctionItems[i].money);
        }
    }
    //添加商品到购物车
    public void shoppingCar(int x){
        if (x >= 0 && x < auctionItems.length) {
            car[x]=auctionItems[x];
            System.out.println("商品序号：" + x + "\n商品名称：" + auctionItems[x].aname + "\n商品详情：" + auctionItems[x].information + "\n商品价格" + auctionItems[x].money);
            arr[0]=arr[0]+auctionItems[x].money;
        }
        else {
            System.out.println("您输入的商品"+x+"不存在");
        }
    }
    //展示购物车中的商品
    public void showShoppingCar(){
        for (int i = 0; i < car.length; i++) {
            if(car[i]!=null){
                System.out.println("商品序号："+i+"\n商品名称："+car[i].aname+"\n商品详情："+car[i].information+"\n商品价格"+car[i].money);
                System.out.println("---------");
            }

        }
        System.out.println("商品总金额为："+arr[0]);
    }
    //结算金额
    public void settle(){
        int x=UserDao.money[0]-arr[0];
        if(x>=0){
            System.out.println("您的金币还剩"+x);
        }else {
            System.out.println("您的金额不够，请充值");
        }
    }
    //将结算商品放入百宝囊中
    public static void Ubag(){
        for (int i = 0; i < car.length; i++) {
            if(car[i]!=null){
                System.out.println("商品名称："+car[i].aname+"\n商品详情："+car[i].information+"\n商品价格"+car[i].money);
            }
        }
    }
    //上架拍卖商品
    public static void sale(String aname){
        if(UserDao.money[0]>500){

            for (int i = 0; i < car.length; i++) {
                if(car[i]!=null){
                    if(aname.equals(car[i].aname)){
                        System.out.println("商品序号：" + i + "\n商品名称：" + auctionItems[i].aname + "\n商品详情：" + auctionItems[i].information + "\n商品价格" + auctionItems[i].money);
                    }
                }
            }
        }else {
            System.out.println("您的金额不足500，没有出售商品的资格");
        }
    }

}
