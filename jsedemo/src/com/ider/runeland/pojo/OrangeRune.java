package com.ider.runeland.pojo;

public class OrangeRune extends Epigraph{
    private int adhurt;//物理攻击
    private int aphurt;//法术攻击
    private int adSpeed;//攻击速度
    private int adPenetrate;//物理穿透
    private int adLeech;//物理吸血
    private int apPenetrate;//法术穿透
    private int apCrit;//暴击率
    private int apCriteffect;//暴击效果
    private int maxlife;//最大生命
    private int adDefense;//物理防御
    OrangeRune(String sname,String color,int level,int adhurt,
               int aphurt,int adSpeed,int  maxlife, int adDefense,
               int adLeech,  int apCrit, int  apCriteffect,
               int adPenetrate,int apPenetrate){

        this.sname=sname;
        this.color=color;
        this.level=level;
        this.adhurt=adhurt;
        this.aphurt=aphurt;
        this.adSpeed=adSpeed;
        this.maxlife=maxlife;
        this.adDefense=adDefense;
        this.adLeech=adLeech;
        this.apCrit=apCrit;
        this.apCriteffect=apCriteffect;
        this.adPenetrate=adPenetrate;
        this.apPenetrate=apPenetrate;
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
    public void setAphurt(int aphurt){
        this.aphurt=aphurt;
    }

    public int  getadSpeed(){
        return this.adSpeed;
    }
    public  void setadSpeed(int adSpeed){
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
    public void setadDefense(int adDefense){
        this.adDefense=adDefense;
    }



    public int  getadLeech(){
        return this.adLeech;
    }
    public void setadLeech(int adLeech){
        this.adLeech=adLeech;
    }

    public int  getapCrit(){
        return this.apCrit;
    }
    public void setapCrit(int apCrit){
        this.apCrit=apCrit;
    }



    public int  getapCriteffect(){
        return this.apCriteffect;
    }
    public void setapCriteffect(int apCriteffect){
        this.apCriteffect=apCriteffect;
    }

    public int  getadPenetrate(){
        return this.adPenetrate;
    }
    public void setadPenetrate(int adPenetrate){
        this.adPenetrate=adPenetrate;
    }

    public int  getapPenetrate(){
        return this.apPenetrate;
    }
    public void setapPenetrate(int apPenetrate){
        this.apPenetrate=apPenetrate;
    }




    }






