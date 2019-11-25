package com.ider.runeland.pojo;

public class BlueRune extends Epigraph{
    private int adhurt;//物理攻击
    private int aphurt;//法术攻击
    private int adSpeed;//攻击速度
    private int maxlife;//最大生命
    private int apHeal;//每5秒回血
    private int MoveSpeed;//移速
    private int adLeech;//物理吸血
    private int apLeech;//法术吸血
    private int apDefense;//法术防御
    private int adDefense;//物理防御
    private int apCrit;//暴击率

    BlueRune(String sname, String color, int level, int adhurt, int aphurt,
             int adSpeed, int maxlife, int adDefense, int adLeech,
             int apLeech, int apCrit, int apHeal, int MoveSpeed) {
        this.sname = sname;
        this.color = color;
        this.level = level;
        this.adhurt = adhurt;
        this.aphurt = aphurt;
        this.adSpeed = adSpeed;
        this.maxlife = maxlife;
        this.adDefense = adDefense;
        this.adLeech = adLeech;
        this.apLeech = apLeech;
        this.apCrit = apCrit;
        this.apHeal=apHeal;
        this.MoveSpeed=MoveSpeed;
    }

    public String getname(){return this.sname;}
    public void setname(String name){this.sname=name;}

    public String getcolor(){return this.color;}
    public void setcolor(String color){this.color=color;}

    public int  getlevel(){
        return this.level;
    }
    public void setlevel(int level){
        this.level=level;
    }
    public int  getadhurt(){
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

    public int  getAdSpeed(){
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
    public void setadDefense(int adDefense){
        this.adDefense=adDefense;
    }



    public int  getadLeech(){
        return this.adLeech;
    }
    public void setadLeech(int adLeech){
        this.adLeech=adLeech;
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
    public int  getapHeal(){
        return this.apHeal;
    }
    public void setapHeal(int apHeal){
        this.apHeal=apHeal;
    }
    public int  getMoveSpeed(){
        return this.MoveSpeed;
    }
    public void setMoveSpeed(int MoveSpeed){
        this.MoveSpeed=MoveSpeed;
    }

}
