package com.ider.RuneLandNew.utils;
import com.ider.RuneLandNew.poJoN.EpigraphNew;
import com.ider.RuneLandNew.poJoN.UsersNew;

public class SceneUtil {
    public static void home(UsersNew usersNew,int nu){
        if(usersNew!=null){
            System.out.println("---当前用户："+usersNew.getUname()+"---");
            System.out.println("---已选符文："+usersNew.getUname()+"---");
        }
        if(nu==1){
            System.out.println("用户注册成功!");
        }
        System.out.println("欢迎来到符文大陆，请根据数字序号选择功能");
        System.out.println("1.用户登陆");
        System.out.println("2.用户注册");
        System.out.println("9.离开大陆");
    }
    public static void Select(UsersNew usersNew){
        if(usersNew!=null){
            int num=0;
            System.out.println("---当前用户："+usersNew.getUname()+"---");
            //获取符文数组
            EpigraphNew[] epi = usersNew.getEPI();
            //判断数组中存在的元素个数
            for (int i = 0; i < epi.length; i++) {
                if(epi[i]!=null){
                    num++;
                }
            }
            System.out.println("---已选符文："+num+"---");
        }
        System.out.println("欢迎来到符文大陆，请选择你想要的符文力量");
        System.out.println("一共有橙色、蓝色、绿色三种符文力量，每种符文力量可以选择10个");
        System.out.println("1.橙色符文");
        System.out.println("2.蓝色符文");
        System.out.println("3.绿色符文");
        System.out.println("---------------------------------------");
        System.out.println("0.返回上一页-----------------9.离开大陆");
    }

}
