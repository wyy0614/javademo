package com.ider.auction.dao;

import com.ider.auction.pojo.Users;

public class UserDao {
    //用户数据数组
    public static Users[] users;
    public static int[] money;
    public static Users[]bag;

    static {
        users = new Users[10];
        money = new int[1];
        bag=new Users[10];
    }

    //用户注册
    //根据用户名查找一个用户
    public Users selectByUname(String uname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUname().equals(uname)) {
                    return users[i];
                }
            }
        }
        return null;
    }

    //往数组内放入一个新用户
    public int addOne(Users u) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = u;
                return 1;
            }
        }
        return 0;
    }

    //用户登陆
    //从数组中取出用户名和密码与用户输入的信息做比较
    public int compare(String uname, String password) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUname().equals(uname) && users[i].getPassword().equals(password)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    //用户充值
    public int initialAmount(int m) {
        for (int i = 0; i < 1; i++) {
            if (m >= 0 && m <= 100) {
                money[i] = money[i] + m;
                return money[i];
            } else {
                return -1;
            }
        }
        return 9;
    }

    //用户身份
    public String identity(String id) {
        for (int i = 0; i < money.length; i++) {
            if (money[i] >= 0 && money[i] <= 500) {
                return "您的身份等级为小白";
            } else if (money[i] > 500 && money[i] <= 3000) {
                return "您的身份等级为平民";
            } else if (money[i] > 3000 && money[i] <= 6000) {
                return "您的身份等级为商人";
            } else if (money[i] > 6000 && money[i] <= 10000) {
                return "您的身份等级为富商";
            } else if (money[i] > 10000 && money[i] <= 20000) {
                return "您的身份等级为首富";
            }
        }
        return null;
    }
public int a(){
        return money[0];
}

}
