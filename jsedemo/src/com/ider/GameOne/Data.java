package com.ider.GameOne;

public class Data {
    String sj;//数据类型
    String ys;//原始值
    String xz;//新值
    //无参构造方式
    public Data(){

    }
//    有参构造方式
    public Data(String s,String y,String x){
        this.sj=s;
        this.ys=y;
        this.xz=x;
    }

    public static void main(String[] args) {
        Data d=new Data("生肖","鼠","上官");
        Data d2=new Data("生肖","鼠","上官");

        System.out.println(d.ys);
        System.out.println(d.xz);
    }
}
