public class Mage extends Character{
    private double matk;
    public Mage(String name,Accessory accessory){
        this.matk = 20;
        this.name = name;
        this.runSpeed=10;
//        if(accessory!=null){
//            this.accessory  deep copy
              //  buff
//        }
    }
    public void magicAttack(Character op){
        if(matk>op.def) {
            double damage = atk-op.def;
            System.out.println(this.name+" used magic attack to "+op.name+" "+damage +" damage ");
            if(op.maxHp<=damage){
                op.maxHp=0;
                this.levelUp();
                System.out.println(op.name+" is dead!");
            }else{
                op.maxHp-=matk-op.def;
            }
        }else{
            System.out.println(this.name+" used magic attack to "+op.name+ "0 damage ");
        }
    };
    @Override
    protected void levelUp(){
        System.out.println("You level up!");
//        if(accessory!=null) accessory.levelUp();
        lvl++;
        maxHp=100+(10*lvl);
        maxMana=100+(10*lvl);
        runSpeed= 10 +(2*lvl);
        matk = 20+(2*lvl);
//        if(accessory!=null)  {
//            this.runSpeed-=(accessory.lvl);
//            //buff
//            if(!abilityOn) use;
//        }
    };
}
