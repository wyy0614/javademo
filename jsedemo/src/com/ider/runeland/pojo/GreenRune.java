package com.ider.runeland.pojo;

public class GreenRune extends Epigraph{
    private int adhurt;//物理攻击
    private int aphurt;//法术攻击
    private int adSpeed;//攻击速度
    private int apCoolDown;//冷却缩减
    private int adPenetrate;//物理穿透
    private int apPenetrate;//法术穿透
    private int adDefense;//物理防御
    private int apDefense;//法术防御
    private int apCrit;//暴击率
    private int apHeal;//每5秒回血
    private int maxlife;//最大生命
    private int apLeech;//法术吸血


    GreenRune(String sname, String color, int level, int adhurt, int aphurt,
              int adSpeed, int maxlife, int adDefense,  int  apDefense,
              int apLeech, int apCrit, int adPenetrate, int apPenetrate,
              int apCoolDown,int apHeal) {

        this.sname = sname;
        this.color = color;
        this.level = level;
        this.adhurt = adhurt;
        this.aphurt = aphurt;
        this.adSpeed = adSpeed;
        this.maxlife = maxlife;
        this.adDefense = adDefense;
        this.apDefense = apDefense;
        this.apLeech = apLeech;
        this.apCrit = apCrit;
        this.adPenetrate=adPenetrate;
        this.apPenetrate=apPenetrate;
        this.apCoolDown=apCoolDown;
        this.apHeal=apHeal;

    }

    public String getsname(){return this.sname;}
    public void setsname(String sname){this.sname=sname;}

    public String getcolor(){return this.color;}
    public void setcolor(String color){this.color=color;}

    public int  getlevel(){
        return this.level;
    }
    public void setlevel(int level){
        this.level=level;
    }



    public int  getAdhurt(){
        return this.adhurt;
    }
    public void setAdhurt(int adhurt){
        this.adhurt=adhurt;
    }

    public int  getAphurt(){
        return this.aphurt;
    }
    public void setApHurt(int aphurt){
        this.aphurt=aphurt;
    }

    public int  getadSpeed(){
        return this.adSpeed;
    }
    public  void setAdSpeed(int AdSpeed){
        this.adSpeed=adSpeed;
    }

    public int  getmaxlife(){
        return this.maxlife;
    }
    public void setmaxlife(int maxlife){
        this.maxlife=maxlife;
    }

    public int  getadDefense(){
        return this.adDefense;
    }
    public void setaddefense(int adDefense){
        this.adDefense=adDefense;
    }

    public int  getapDefense(){
        return this.apDefense;
    }
    public void setapdefense(int apDefense){
        this.apDefense=apDefense;
    }

    public int  getapLeech(){
        return this.apLeech;
    }
    public void setapLeech(int apLeech){
        this.apLeech=apLeech;
    }

    public int  getapCrit(){
        return this.apCrit;
    }
    public void setapCrit(int apCrit){
        this.apCrit=apCrit;
    }
    public int getadPenetrate(){
        return this.adPenetrate;
    }
    public void setadPenetrate(int adPenetrate){
        this.adPenetrate=adPenetrate;
    }

    public int getapPenetrate(){
        return this.apPenetrate;
    }
    public void setapPenetrate(int apPenetrate){
        this.apPenetrate=apPenetrate;
    }

    public int  getapCoolDown(){
        return this.apCoolDown;
    }
    public void setapCoolDown(int apCoolDown){
        this.apCoolDown=apCoolDown;
    }

    public int  getapHeal(){
        return this.apHeal;
    }
    public void setapHeal(int apHeal){
        this.apHeal=apHeal;
    }




}
