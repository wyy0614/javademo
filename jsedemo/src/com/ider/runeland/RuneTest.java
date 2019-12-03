//package com.ider.runeland;
//
//import com.ider.runeland.pojo.*;
//import java.util.Scanner;
//public class RuneTest {
//    Epigraph[]epi=new Epigraph[93];
//    OrangeRune[]oarr=new OrangeRune[31];
//    GreenRune[]garr=new GreenRune[31];
//    BlueRune[]barr=new BlueRune[31];
//    Users[]users=new Users[100];
//
//    public static void main(String[] args) {
////        初始化
////        准备存放符文的数组
//
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("*********************");
//        System.out.println("欢迎来到符文大陆");
//
//        //  用户输入数据
//        String name = sc.next();
//        int m = Users(name, uarr);
//        if (m == 1) {
//            System.out.println("注册成功");
//        } else {
//            System.out.println("注册失败");
//        }
//
//        System.out.println("以下是橙色的符文：");
        //展示橙色的符文
//        OrangeRune o=new OrangeRune("勇气","橙色",1,60,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[0]=o;
//        OrangeRune o1=new OrangeRune("斗志","橙色",1,0,
//                110, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[1]=o1;
//        OrangeRune o2=new OrangeRune("猛攻","橙色",1,0,
//                0, 40,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[2]=o2;
//        OrangeRune o3=new OrangeRune("白刃","橙色",2,70,
//                0, 20,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[3]=o3;
//        OrangeRune o4=new OrangeRune("痛苦","橙色",2,0,
//                120, 0,0, 0,
//                0, 10,0,0,
//                0);
//        oarr[4]=o4;
//        OrangeRune o5=new OrangeRune("践踏","橙色",2,0,
//                0, 60,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[5]=o5;
//        OrangeRune o6=new OrangeRune("震击","橙色",2,50,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[6]=o6;
//        OrangeRune o7=new OrangeRune("拯救","橙色",3,100,
//                0, 0,0, 0,
//                0, 0,0,100,
//                0);
//        oarr[7]=o7;
//        OrangeRune o8=new OrangeRune("致命","橙色",3,130,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[8]=o8;
//        OrangeRune o9=new OrangeRune("恐惧","橙色",3,0,
//                210, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[9]=o9;
//        OrangeRune o10=new OrangeRune("信念","橙色",3,0,
//                170, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[10]=o10;
//        OrangeRune o11=new OrangeRune("振奋","橙色",3,0,
//                0, 50,0, 0,
//                0, 30,0,0,
//                0);
//        oarr[11]=o11;
//        OrangeRune o12=new OrangeRune("一闪","橙色",3,0,
//                0, 0,0, 0,
//                0, 30,130,0,
//                0);
//        oarr[12]=o12;
//        OrangeRune o13=new OrangeRune("暴戾","橙色",4,150,
//                0, 0,1350, 0,
//                0, 0,0,0,
//                0);
//        oarr[13]=o13;
//        OrangeRune o14=new OrangeRune("荆棘","橙色",4,150,
//                0, 40,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[14]=o14;
//        OrangeRune o15=new OrangeRune("戒律","橙色",4,0,
//                250, 0,0, 0,
//                0, 30,0,0,
//                0);
//        oarr[15]=o15;
//        OrangeRune o16=new OrangeRune("阳炎","橙色",4,0,
//                250, 0,0, 0,
//                0, 0,0,0,
//                140);
//        oarr[16]=o16;
//        OrangeRune o17=new OrangeRune("衰败","橙色",4,0,
//                0, 120,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[17]=o17;
//        OrangeRune o18=new OrangeRune("风暴","橙色",4,0,
//                0, 60,0, 0,
//                0, 30,110,0,
//                0);
//        oarr[18]=o18;
//        OrangeRune o19=new OrangeRune("惩戒","橙色",4,0,
//                0, 0,0, 0,
//                0, 100,0,0,
//                0);
//        oarr[19]=o19;
//        OrangeRune o20=new OrangeRune("狂热","橙色",4,0,
//                0, 0,0, 0,
//                0, 50,200,0,
//                0);
//        oarr[20]=o20;
//        OrangeRune o21=new OrangeRune("圣人","橙色",5,0,
//                530, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[21]=o21;
//        OrangeRune o22=new OrangeRune("传承","橙色",5,320,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[22]=o22;
//        OrangeRune o23=new OrangeRune("异变","橙色",5,200,
//                0, 0,0, 0,
//                0, 0,0,360,
//                0);
//        oarr[23]=o23;
//        OrangeRune o24=new OrangeRune("纷争","橙色",5,250,
//                0, 0,0, 0,
//                50, 0,0,360,
//                0);
//        oarr[24]=o24;
//        OrangeRune o25=new OrangeRune("梦魇","橙色",5,0,
//                420, 0,0, 0,
//                0, 0,0,0,
//                240);
//        oarr[25]=o25;
//        OrangeRune o26=new OrangeRune("凶兆","橙色",5,0,
//                420, 60,0, 0,
//                0, 0,0,0,
//                0);
//        oarr[26]=o26;
//        OrangeRune o27=new OrangeRune("宿命","橙色",5,0,
//                0, 100,3370, 230,
//                0, 0,0,0,
//                0);
//        oarr[27]=o27;
//        OrangeRune o28=new OrangeRune("红月","橙色",5,0,
//                0, 160,0, 0,
//                0, 50,0,0,
//                0);
//        oarr[28]=o28;
//        OrangeRune o29=new OrangeRune("无双","橙色",5,0,
//                0, 0,0, 0,
//                0, 70,360,0,
//                0);
//        oarr[29]=o29;
//        OrangeRune o30=new OrangeRune("祸源","橙色",5,0,
//                0, 0,0, 0,
//                0, 160,0,0,
//                0);
//        oarr[30]=o30;
//        for(int i=0;i<oarr.length;i++){
//            if(oarr[i]!=null){
//                System.out.println("\n"+i+"名字："+oarr[i].getname()+
//                        "颜色:"+oarr[i].getcolor()+
//                        "等级："+oarr[i].getlevel()+
//                        "物理攻击："+oarr[i].getAdHurt()/100.00+
//                        "法术攻击："+oarr[i].getApHurt()/100.00+
//                        "攻速;"+oarr[i].getAdSpeed()/100.00+"%"+
//                        "最大生命力："+oarr[i].getmaxlife()/100.00+
//                        "物理防御："+oarr[i].getaddefense()/100.00+
//                        "物理吸血："+oarr[i].getadbloodsucking()/100.00+
//                        "暴击率："+oarr[i].gethitrate()/100.00+"%"+
//                        "暴击效果："+oarr[i].getcriteffect()/100.00+"+"+
//                        "物理穿透："+oarr[i].getadpenetration()/100.00+
//                        "法术穿透："+oarr[i].getappenetration()/100.00);
//            }
//
//        }
//
//        System.out.println("以下是蓝色的符文：");
//        BlueRune b=new BlueRune("活力","蓝色",1,0,
//                0, 0,1500, 0,
//                0, 0,0,0,
//                0);
//        barr[0]=b;
//        BlueRune b1=new BlueRune("治疗 ","蓝色",1,0,
//                0, 0,0, 0,
//                0, 0,0,300,
//                0);
//        barr[1]=b1;
//        BlueRune b2=new BlueRune("疾行 ","蓝色",1,0,
//                0, 0,0, 0,
//                0, 0,0,0,
//                300);
//        barr[2]=b2;
//        BlueRune b3=new BlueRune("刚毅 ","蓝色",2,30,
//                0, 0,0, 0,
//                40, 0,0,0,
//                0);
//        barr[3]=b3;
//        BlueRune b4=new BlueRune("吸收 ","蓝色",2,0,
//                40, 0,0, 0,
//                0, 40,0,0,
//                0);
//        barr[4]=b4;
//        BlueRune b5=new BlueRune("生长","蓝色",2,0,
//                0, 0,2100, 0,
//                0, 0,0,0,
//                0);
//        barr[5]=b5;
//        BlueRune b6=new BlueRune("愈合","蓝色",2,0,
//                0, 0,0, 0,
//                0, 0,0,420,
//                0);
//        barr[6]=b6;
//        BlueRune b7=new BlueRune("强健","蓝色",3,40,
//                0, 0,2400, 0,
//                0, 0,0,0,
//                0);
//        barr[7]=b7;
//        BlueRune b8=new BlueRune("感应","蓝色",3,40,
//                80, 0,0, 0,
//                0, 0,0,0,
//                0);
//        barr[8]=b8;
//        BlueRune b9=new BlueRune("绽放","蓝色",3,0,
//                0, 0,1200, 0,
//                0, 0,0,420,
//                0);
//        barr[9]=b9;
//        BlueRune b10=new BlueRune("神速","蓝色",3,0,
//                0, 0,0, 0,
//                40, 0,0,0,
//                30);
//        barr[10]=b10;
//        BlueRune b11=new BlueRune("饮血","蓝色",3,0,
//                0, 0,0, 0,
//                60, 0,0,0,
//                0);
//        barr[11]=b11;
//        BlueRune b12=new BlueRune("转换","蓝色",3,0,
//                0, 0,0, 0,
//                0, 60,0,0,
//                0);
//        barr[12]=b12;
//        for(int i=0;i<barr.length;i++){
//            if(barr[i]!=null){
//                System.out.println("\n"+i+"名字："+barr[i].getname()+
//                        "颜色:"+barr[i].getcolor()+
//                        "等级："+barr[i].getlevel()+
//                        "物理攻击："+barr[i].getAdHurt()/100.00+
//                        "法术攻击："+barr[i].getApHurt()/100.00+
//                        "攻速;"+barr[i].getAdSpeed()/100.00+"%"+
//                        "最大生命力："+barr[i].getmaxlife()/100.00+
//                        "物理防御："+barr[i].getaddefense()/100.00+
//                        "物理吸血："+barr[i].getadbloodsucking()/100.00+
//                        "法术吸血："+barr[i].getapbloodsucking()/100.00+
//                        "暴击率："+barr[i].gethitrate()/100.00+"%"+
//                        "每5秒回血："+barr[i].gethx()/100.00+"+"+
//                        "移速："+barr[i].getys()/100.00);
//            }
//
//        }
//        System.out.println("以下是绿色的符文：");
//        GreenRune g=new GreenRune("应激","绿色",1,0,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0,20,0);
//        garr[0]=g;
//        GreenRune g1=new GreenRune("穿刺","绿色",1,0,
//                0, 0,0, 0,
//                0, 0,0,160,
//                0,0,0);
//        garr[1]=g1;
//        GreenRune g2=new GreenRune("专注","绿色",1,0,
//                0, 0,0, 0,
//                0, 0,0,0,
//                160,0,0);
//        garr[2]=g2;
//        GreenRune g3=new GreenRune("坚壁","绿色",2,0,
//                0, 0,0, 250,
//                0, 0,0,0,
//                0,0,0);
//        garr[3]=g3;
//        GreenRune g4=new GreenRune("幻盾","绿色",2,0,
//                0, 0,0, 0,
//                250, 0,0,0,
//                0,0,0);
//        garr[4]=g4;
//        GreenRune g5=new GreenRune("破甲","绿色",2,0,
//                0, 20,0, 0,
//                0, 0,0,180,
//                0,0,0);
//        garr[5]=g5;
//        GreenRune g6=new GreenRune("洞察","绿色",2,0,
//                0, 0,0, 0,
//                0, 0,10,0,
//                180,0,0);
//        garr[6]=g6;
//        GreenRune g7=new GreenRune("风怒","绿色",3,40,
//                0, 0,0, 0,
//                290, 0,0,0,
//                0,0,0);
//        garr[7]=g7;
//        GreenRune g8=new GreenRune("崩坏","绿色",3,0,
//                60, 0,0, 0,
//                0, 0,0,0,
//                260,0,0);
//        garr[8]=g8;
//        GreenRune g9=new GreenRune("突进","绿色",3,0,
//                0, 0,0, 0,
//                0, 0,0,0,
//                0,30,240);
//        garr[9]=g9;
//        GreenRune g10=new GreenRune("收割","绿色",3,0,
//                0, 0,0, 110,
//                0, 0,0,260,
//                0,0,0);
//        garr[10]=g10;
//        for(int i=0;i<garr.length;i++){
//            if(garr[i]!=null){
//                System.out.println("\n"+i+"名字："+garr[i].getname()+
//                        "颜色:"+garr[i].getcolor()+
//                        "等级："+garr[i].getlevel()+
//                        "物理攻击："+garr[i].getAdHurt()/100.00+
//                        "法术攻击："+garr[i].getApHurt()/100.00+
//                        "攻速:"+garr[i].getAdSpeed()/100.00+"%"+
//                        "最大生命力："+garr[i].getmaxlife()/100.00+
//                        "物理防御："+garr[i].getaddefense()/100.00+
//                        "法术防御："+garr[i].getapdefense()/100.00+
//                        "法术吸血："+garr[i].getapbloodsucking()/100.00+
//                        "暴击率："+garr[i].gethitrate()/100.00+"%"+
//                        "物理穿透："+garr[i].getAdpenetration()/100.00+
//                        "法术穿透："+garr[i].getAppenetration()/100.00+
//                        "冷却缩减："+garr[i].getLqsj()/100.00+
//                        "每5秒回血："+garr[i].gethx()/100.00+"+");
//            }
//
//        }
//
//        System.out.println("您可以从中选择30个符文，橙色、绿色、蓝色各10个");
//        String a=sc.next();
//
//    }
//    //用户注册
//    public static int Users(String sname,Users[]uarr){
//        //  创建一个用户对象
//        Users u = new Users();
//        // 给对象的属性赋值
//        u.sname = sname;
//        // 保存对象（数组）
//        for (int i = 0; i <uarr.length; i++) {
//            if (uarr[i] == null) {
//                uarr[i] = u;
//                return 1;
//            }
//        }
//        return -1;
//    }
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
