package com.ider.RuneLandNew.poJoN;

public class Green {
    static final String COLOR="绿色";
    private double adhurt;//物理攻击
    private double aphurt;//法术攻击
    private double adSpeed;//攻击速度
    private double apCoolDown;//冷却缩减
    private double adPenetrate;//物理穿透
    private double apPenetrate;//法术穿透
    private double adDefense;//物理防御
    private double apDefense;//法术防御
    private double apCrit;//暴击率
    private double apHeal;//每5秒回血
    private double maxlife;//最大生命
    private double apLeech;//法术吸血
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
    //冷却缩减
    public double getApCoolDown(){
        return this.apCoolDown;
    }
    public void setApCoolDown(double apCoolDown){
        this.apCoolDown=apCoolDown;
    }
    //物理穿透
    public double getAdPenetrate(){
        return this.adPenetrate;
    }
    public void setAdPenetrate(double adPenetrate){
        this.adPenetrate=adPenetrate;
    }
    //法术穿透
    public double getApPenetrate(){
        return this.apPenetrate;
    }
    public void setApPenetrate(double apPenetrate){
        this.apPenetrate=apPenetrate;
    }
    //物理防御
    public double getAdDefense(){
        return this.adDefense;
    }
    public void setAdDefense(double adDefense){
        this.adDefense=adDefense;
    }
    //法术防御
    public double getApDefense(){
        return this.apDefense;
    }
    public void setApDefense(double apDefense){
        this.apDefense=apDefense;
    }
    //暴击率
    public double getApCrit(){
        return this.apCrit;
    }
    public void setApCrit(double apCrit){
        this.apCrit=apCrit;
    }
    //每5秒回血
    public double getApHeal(){
        return this.apHeal;
    }
    public void setApHeal(double apHeal){
        this.apHeal=apHeal;
    }
    //最大生命
    public double getMaxlife(){
        return this.maxlife;
    }
    public void setMaxlife(double maxlife){
        this.maxlife=maxlife;
    }
    //法术吸血
    public double getApLeech(){
        return this.apLeech;
    }
    public void setApLeech(double apLeech){
        this.apLeech=apLeech;
    }
}
