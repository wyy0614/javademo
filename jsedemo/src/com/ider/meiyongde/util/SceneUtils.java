package com.ider.meiyongde.util;

import com.ider.meiyongde.basicInf.Userinfo;

public class SceneUtils {
    public static void home(Userinfo userinfo){

        System.out.println("******************************");
        System.out.println("欢迎来到充满惊喜的星空拍卖场，在这里你可以找到梦寐以求的东西，也可将自己的东西拍卖给别人从而得到金币");
        System.out.println("想要进入拍卖场，就要遵守拍卖场的规则，请选择下列序号：");
        System.out.println("1.用户注册");
        System.out.println("2.用户登陆");
        System.out.println("9.离开拍卖场");
    }
    public static void actionHome(Userinfo userinfo){
        if(userinfo!=null){
            System.out.println("==========当前用户"+userinfo.getUname()+"==========");
            System.out.println("==========现有资金"+userinfo.getMoney()+"==========");
        }

    }
}
