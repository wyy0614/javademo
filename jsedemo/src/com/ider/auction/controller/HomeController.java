package com.ider.auction.controller;

import com.ider.auction.pojo.AuctionItem;
import com.ider.auction.pojo.Users;

public class HomeController {
    public static void Home(Users users) {
        System.out.println("******************************");
        System.out.println("欢迎来到充满惊喜的星空拍卖场，在这里你可以找到梦寐以求的东西，也可将自己的东西拍卖给别人从而得到金币");
        System.out.println("想要进入拍卖场，就要遵守拍卖场的规则，请选择下列序号：");
        System.out.println("1.用户注册");
        System.out.println("2.用户登陆");
        System.out.println("9.离开拍卖场");
    }
    public static void homing(Users users){
        System.out.println("******************************");
        System.out.println("恭喜你进入星空拍卖场，在这里你可以干一下事情，请选择下列序号：");
        System.out.println("1金币充值\t 2展示拍卖行商品\t 3拍卖行商品排行榜\t 4购物车\t 5购物车详情\t 6查看百宝囊\t 7上架商品 0离开拍卖场");
    }
    public static void money(Users users){
//        System.out.println("******************************");
        System.out.println("是否要选择充钱，充钱金额为0-100");
        System.out.println("充钱选1，不充钱选0");
    }

    public static void paimaihang(AuctionItem auctionItem){
        System.out.println("******************************");
        System.out.println("欢迎进入拍卖行");
        System.out.println("以下为此拍卖行的商品信息");
    }
    public static void selece(AuctionItem auctionItem){
        System.out.println("你可以通过输入商品序号或商品名称查询具体的商品信息");
        System.out.println("按照商品序号搜索请输入0，按照商品名称搜索请输入1");
    }
    public static void paihangbang(AuctionItem auctionItem){
        System.out.println("本拍卖行有一个神奇的排行榜，你想看看嘛？");
        System.out.println("想看请输入1，不想看请输入0？");
    }
    public static void shoppingCar(AuctionItem auctionItem){
        System.out.println("欢迎进入您的购物车！");
        System.out.println("请输入您要加入购物车的商品序号：");
    }

}
