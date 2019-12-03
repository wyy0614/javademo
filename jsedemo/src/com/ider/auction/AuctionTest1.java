package com.ider.auction;

import com.ider.auction.controller.HomeController;
import com.ider.auction.controller.UserController;
import com.ider.auction.dao.AuctionItemDao;
import com.ider.auction.pojo.AuctionItem;
import com.ider.auction.pojo.Users;

import java.util.Scanner;
public class AuctionTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users users = new Users();
        UserController uc = new UserController();
        AuctionItem auctionItem = new AuctionItem();
        AuctionItemDao ac = new AuctionItemDao();

        tuichu:
        for (int q = 0; q < 1; ) {
            HomeController.Home(users);
            int w = sc.nextInt();
            switch (w) {
                case 1:
                    System.out.println("请输入用户名：");
                    String uname = sc.next();
                    System.out.println("请输入密码：");
                    String password = sc.next();
                    String register = uc.register(uname, password);
                    System.out.println(register);
                    break;
                case 2:
                    for (int i = 1; i < 2; i++) {
                        System.out.println("请登陆");
                        System.out.println("请输入用户名：");
                        String uname2 = sc.next();
                        System.out.println("请输入密码：");
                        String password2 = sc.next();
                        String login = uc.login(uname2, password2);
                        if (login == "登录成功") {
                            System.out.println(login);
                            System.out.println("当前用户为：" + uname2);

                        } else {
                            System.out.println(login);
                            i = sc.nextInt();
                        }
                    }
                    String id = "小白";
                    String identity = uc.identity(id);
                    System.out.println("当前用户身份级别为：" + identity);
                    System.out.println("当前用户拥有资金：" + users.getMoney());
                    break tuichu;
                case 9:
                    return;
            }
        }

        for (int q = 0; q < 2; ) {
            HomeController.homing(users);
            int r=sc.nextInt();
            switch (r){
                case 1:
            //用户充值
                    System.out.println("当前用户拥有资金：" + users.getMoney());
            HomeController.money(users);
            int a = sc.nextInt();
            if (a == 1) {

                for (int i = 0; i < 1; ) {
                    System.out.println("您要充值的金额为:");
                    int money = sc.nextInt();
                    int recharge = uc.recharge(money);
                    System.out.println("当前用户拥有资金：" + recharge);

                    if (recharge == 0) {
                        i = sc.nextInt();
                        System.out.println("您要充值的金额为:");
                        money = sc.nextInt();
                        recharge = uc.recharge(money);
                        System.out.println("当前用户拥有资金：" + recharge);
                    }
                    System.out.println("是否要继续充值？0继续，1放弃");
                    i = sc.nextInt();
                }
            } else {
                int money = 0;
                int recharge = uc.recharge(money);
                System.out.println("当前用户拥有资金：" + recharge);
            }
            String id = "小白";
            String identity = uc.identity(id);
            System.out.println("当前用户身份级别为：" + identity);
            break;
                case 2:
            //拍卖行信息
            HomeController.paimaihang(auctionItem);
            ac.information();
            //查询商品信息
            for (int m = 1; m == 1; ) {
                HomeController.selece(auctionItem);
                int x = sc.nextInt();
                if (x == 0) {
                    System.out.println("输入要查询的商品序号：");
                    int b = sc.nextInt();
                    ac.selectByAuctionItem(b);
                } else if (x == 1) {
                    System.out.println("输入要查询的商品名称：");
                    String c = sc.next();
                    ac.selectByAuctionItemname(c);
                }
                System.out.println("是否要继续选择查看商品信息？1继续，0放弃");
                m = sc.nextInt();
            }
            break;
                case 3:
            //排行榜
            HomeController.paihangbang(auctionItem);
            int w = sc.nextInt();
            if (w == 1) {
                ac.sort();
            }
            break;
                case 4:
                    for(int m=1;m==1;){
                        HomeController.shoppingCar(auctionItem);
                        int z=sc.nextInt();
                        ac.shoppingCar(z);
                        System.out.println("是否要继续添加商品？1继续，0放弃");
                        m = sc.nextInt();
                    }
                    break;
                case 5:
                    ac.showShoppingCar();
                    System.out.println("是否进行商品结算？1结算，0放弃");
                    int p=sc.nextInt();
                    if(p==1){
                       ac.settle();
                    }
                    break;
                case 6:
                    System.out.println("您的百宝囊中存有商品：");
                    ac.Ubag();

                    break;
                case 7:
                    System.out.println("您是否想将您百宝囊中的物品上传购物车？1想，2不想");
                    int u=sc.nextInt();
                    if(u==1){
                        System.out.println("选择你要上传的商品，输入商品名称");
                        String aname=sc.next();
                        ac.sale(aname);
                    }
                    break;
                case 0:
                    return;
        }
        }
    }
}


