package com.ider.TextZ;

public class Text13 {
    public static void main(String[] args) {
        int score=94;
        String sex="女";
        if(score>80){
            if(sex=="女"){
                System.out.println("进入女子组决赛");
            }
            else {
                System.out.println("进入男子组决赛");
            }
        }
        else {
            System.out.println("没有进入决赛");
        }
    }
}
