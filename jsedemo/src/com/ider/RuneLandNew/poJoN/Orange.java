package com.ider.RuneLandNew.poJoN;

public class Orange extends EpigraphNew{
    static final String COLOR="橙色";
    private double adhurt;//物理攻击
    private double aphurt;//法术攻击
    private double adSpeed;//攻击速度
    private double adPenetrate;//物理穿透
    private double adLeech;//物理吸血
    private double apPenetrate;//法术穿透
    private double apCrit;//暴击率
    private double apCriteffect;//暴击效果
    private double maxlife;//最大生命
    private double adDefense;//物理防御
//    Orange(String sname,String color,int leve,double adhurt,double aphurt,double adSpeed,double adPenetrate,double adLeech,double apPenetrate,double apCrit,double apCriteffect,double maxlife,double adDefense){
//        this.adhurt=adhurt;
//        this.aphurt=aphurt;
//        this.adSpeed=adSpeed;
//        this.adPenetrate=adPenetrate;
//        this.adLeech=adLeech;
//        this.apPenetrate=apPenetrate;
//        this.apCrit=apCrit;
//        this.apCriteffect=apCriteffect;
//        this.maxlife=maxlife;
//        this.adDefense=adDefense;
//    }
    //物理攻击
    public double getAdhurt(){
        return this.adhurt;
    }
    public void setAdhurt(double adhurt){
        this.adhurt=adhurt;
    }
    //法术攻击
    public double getAphurt(){
        return this.aphurt;
    }
    public void setAphurt(double aphurt){
        this.aphurt=aphurt;
    }
    //攻击速度
    public double getAdSpeed(){
        return this.adSpeed;
    }
    public void setAdSpeed(double adSpeed){
        this.adSpeed=adSpeed;
    }
    //物理穿透
    public double getAdPenetrate(){
        return this.adPenetrate;
    }
    public void setAdPenetrate(double adPenetrate){
        this.adPenetrate=adPenetrate;
    }
    //物理吸血
    public double getAdLeech(){
        return this.adLeech;
    }
    public void setAdLeech(double adLeech){
        this.adLeech=adLeech;
    }
    //法术穿透
    public double getApPenetrate(){
        return this.apPenetrate;
    }
    public void setApPenetrate(double apPenetrate){
        this.apPenetrate=apPenetrate;
    }
    //暴击率
    public double getApCrit(){
        return this.apCrit;
    }
    public void setApCrit(double apCrit){
        this.apCrit=apCrit;
    }
    //暴击效果
    public double getApCriteffect(){
        return this.apCriteffect;
    }
    public void setApCriteffect(double apCriteffect){
        this.apCriteffect=apCriteffect;
    }
    //最大生命
    public double getMaxlife(){
        return this.maxlife;
    }
    public void setMaxlife(double maxlife){
        this.maxlife=maxlife;
    }
    //物理防御
    public double getAdDefense(){
        return this.adDefense;
    }
    public void setAdDefense(double adDefense){
        this.adDefense=adDefense;
    }
}
