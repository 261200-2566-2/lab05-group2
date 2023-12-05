import java.util.Objects;

public interface Character {
    String name();
    double maxHp();
    void setMaxHp(double i);
    double maxMana();
    void setMaxMana(double i);
    double runSpeed();
    void setRunSpeed(double i);
    double atk();
    void setAtk(double i);
    double def();
    void setDef(double i);
    double getMatk();
    void setMatk(double i);
    int getLvl();
    void setLvl(int i);
    String classHero();
    Accessory accessory();
    void setAccessory(Accessory i,String t);
    default void attack(Character op){
        if(atk()>op.def()) {
            double damage = atk()-op.def();
            System.out.println(this.name()+" attacked "+op.name()+" "+damage +" damage ");
            if(op.maxHp()<=damage){
                op.setMaxHp(0);
                this.levelUp();
                System.out.println(op.name()+" is dead!");
            }else{
                op.setMaxHp(op.maxHp()-(atk()-op.def()));
            }
        }else{
            System.out.println(this.name()+" attacked "+op.name()+ " 0 damage ");
        }
    }
    default void levelUp(){
        System.out.println(this.name()+" level up!");
        setLvl(this.getLvl()+1);
        setMaxHp(100+(10*this.getLvl()));
        setMaxMana(100+(10*getLvl()));
        setRunSpeed(10 +(2*getLvl()));
        if(classHero().equals("Mage")){
            setMatk(20+(2*getLvl()));
            setAtk(10+(getLvl()));
            setDef(5+getLvl());
        }
        if(classHero().equals("Thief")){
            setAtk(20+(2*getLvl()));
            setDef(10+getLvl());
        }
        if(accessory()!=null) {
            if(Objects.equals(accessory().type(), "Ring")){
                setAccessory(this.accessory(),"Ring");
                setMatk(getMatk()+accessory().getMatk());

            }
            if(Objects.equals(accessory().type(), "Boots")){
                setAccessory(this.accessory(),"Boots");
                setRunSpeed(runSpeed()- accessory().getHeavy() + accessory().getRunSpeed());
            }

        }
    }
    default void show(){
        System.out.println("Name :"+name());
        System.out.println("Hp : "+this.maxHp());
        System.out.println("Mana : "+this.maxMana());
        System.out.println("damage : "+ this.atk());
        System.out.println("def : "+ this.def());
        System.out.println("magic attack : "+getMatk());
        System.out.println("level : "+this.getLvl());
        System.out.println("runSpeed : "+this.runSpeed());
        System.out.println("Class : "+this.classHero());
        if(accessory()==null) System.out.println("accessory : none");
        else System.out.println("accessory : "+accessory().name());
    }
}
