public class Mage extends Character{
    public Mage(String name,Accessory accessory){
        this.matk = 20;
        this.name = name;
        this.runSpeed=10;
        this.atk = 10;
        this.def = 5;
        classHero="Mage";
//        if(accessory!=null){
//            this.accessory  deep copy
              //  buff
//        }
    }
    public void magicAttack(Character op){
        if(maxMana>=20){
            maxMana-=20;
                double damage = matk*2;
                System.out.println(this.name+" used magic attack to "+op.name+" "+damage +" damage ");
                if(op.maxHp<=damage){
                    op.maxHp=0;
                    this.levelUp();
                    System.out.println(op.name+" is dead!");
                }else{
                    op.maxHp-=damage;
                }
        }else{
            System.out.println(this.name+" : Not enough mana!");
        }
    };


}
