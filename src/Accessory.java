public class Accessory {
    public String name;
    protected double heavy;
    protected  int lvl;
    protected double runSpeed;
    protected double matk;
    public String type;


    protected Accessory(String name,int lvl,String type){
        this.name=name;
        this.type=type;
        this.lvl=lvl;
    }



    public double getMatk(){
        return matk;
    }

    public double getHeavy(){
        return heavy;
    }

    public double getRunSpeed(){
        return runSpeed;
    }
    public int getLvl(){
        return lvl;
    }

}
