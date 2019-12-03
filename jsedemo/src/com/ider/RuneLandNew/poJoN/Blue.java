package com.ider.RuneLandNew.poJoN;

public class Blue {
    static final String COLOR="蓝色";
    private double adhurt;//物理攻击
    private double aphurt;//法术攻击
    private double adSpeed;//攻击速度
    private double maxlife;//最大生命
    private double apHeal;//每5秒回血
    private double MoveSpeed;//移速
    private double adLeech;//物理吸血
    private double apLeech;//法术吸血
    private double apDefense;//法术防御
    private double adDefense;//物理防御
    private double apCrit;//暴击率
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
    //最大生命
    public double getMaxlife(){
        return this.maxlife;
    }
    public void setMaxlife(double maxlife){
        this.maxlife=maxlife;
    }
    //每5秒回血
    public double getApHeal(){
        return this.apHeal;
    }
    public void setApHeal(double apHeal){
        this.apHeal=apHeal;
    }
    //移速
    public double getMoveSpeed(){
        return this.MoveSpeed;
    }
    public void setMoveSpeed(double MoveSpeed){
        this.MoveSpeed=MoveSpeed;
    }
    //物理吸血
    public double getAdLeech(){
        return this.adLeech;
    }
    public void setAdLeech(double adLeech){
        this.adLeech=adLeech;
    }
    //法术吸血
    public double getApLeech(){
        return this.apLeech;
    }
    public void setApLeech(double apLeech){
        this.apLeech=apLeech;
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
}
