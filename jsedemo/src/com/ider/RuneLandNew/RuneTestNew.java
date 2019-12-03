package com.ider.RuneLandNew;
import com.ider.RuneLandNew.poJoN.EpigraphNew;
import com.ider.RuneLandNew.poJoN.Orange;
import com.ider.RuneLandNew.poJoN.UsersNew;
import com.ider.RuneLandNew.utils.SceneUtil;
import javafx.scene.Scene;

import java.util.Scanner;
public class RuneTestNew {
    static EpigraphNew[]epi;
    static UsersNew[]usersNew;
    static UsersNew us;
    //初始化
    static {
        //符文数组
        epi=new EpigraphNew[93];
        Orange o = new Orange();
//        o.sname();
        o.setAdhurt(0.60);
        epi[0]=o;
        //用户数组
        usersNew=new UsersNew[1000];
    }
    public static void main(String[] args) {
        //键盘录入
        Scanner sc=new Scanner(System.in);
        int m=0;
        int nu=0;
        while (m!=9){
            SceneUtil.home(us,nu);
            m=sc.nextInt();
            //选择功能
            switch (m){
                case 1:
                    System.out.println("请输入用户名");
                    String uname=sc.next();
                    System.out.println("请输入密码");
                    String password=sc.next();
                    //用户登陆
                    us=login(uname,password,usersNew);
                    //跳转选择符文页面
                    if(us!=null) {
                        SceneUtil.Select(us);
                        int x=sc.nextInt();
                        if(x==0){
                            break;
                        }else if(x==9){
                            return;
                        }else {
                            System.out.println("开始选择符文");
                        }
                    }else {
                        System.out.println("该用户还未注册，请先注册");
                    }
                    break;
                case 2:
                    System.out.println("请输入用户名");
                    String uname2=sc.next();
                    System.out.println("请输入密码");
                    String password2=sc.next();
                    nu=register(uname2,password2,usersNew);
                    break;
                case 9:
                    return;
            }
        }
    }
    /**
     *用户注册
     * @param uname
     * @param password
     * @param usersNews
     * @return
     */
public static int register(String uname,String password,UsersNew[]usersNews) {
    UsersNew usersNew = new UsersNew();
    usersNew.setUname(uname);
    usersNew.setPassword(password);
    int a = userExist(usersNew, usersNews);
    if (a == 1) {
        for (int j = 0; j < usersNews.length; j++) {
            if (usersNews[j] == null) {
                usersNews[j] = usersNew;
                return a;
            }
        }
    }
    return a;
}
    /**
     * 判断用户是否存在
     * @param us
     * @param usersNews
     * @return
     */
    public static int userExist(UsersNew us,UsersNew[]usersNews){
        //判断是否为空
        //是否存在
        for(int i=0;i<usersNews.length;i++){
            if(usersNews[i]!=null){
                //没有注册过，把用户放入数组
                if(! usersNews[i].getUname().equals(us.getUname())){
                    return 1;
                        }
                    }else if(i==usersNews.length-1){
                return 1;
            }
                }
        return -1;
            }
    /**
     * 用户登陆
     * @param uname
     * @param password
     * @param usersNews
     * @return
     */
    public static UsersNew login(String uname,String password,UsersNew[]usersNews){
    for(int i=0;i<usersNews.length;i++){
        if(usersNews[i]!=null){
            //当用户名和密码匹配时，登陆成功，返回1
            if(usersNews[i].getUname().equals(uname)&&usersNews[i].getPassword().equals(password)){
                return usersNews[i];
            }
        }
    }
    return null;
}
public static void showRune(int x,EpigraphNew[]epi){

            for (int i = 0; i < epi.length; i++) {
                if(x==1){
                if(epi[i] instanceof Orange){

                }
            }
        }

}












}
