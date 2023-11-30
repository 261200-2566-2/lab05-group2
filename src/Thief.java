public class Thief extends Character{
    public Thief(String name,Accessory accessory){
        this.name = name;
        this.runSpeed=10;
        this.atk = 20;
        this.def = 10;
//        if(accessory!=null){
//            this.accessory  deep copy
        //  buff
//        }
    }
    public void doubleAttack(Character op){
        if(atk>op.def) {
            double damage = (atk*2)-op.def;
            System.out.println(this.name+" used double attack to "+op.name+" "+damage +" damage ");
            if(op.maxHp<=damage){
                op.maxHp=0;
                this.levelUp();
                System.out.println(op.name+" is dead!");
            }else{
                op.maxHp-=(atk*2)-op.def;
            }
        }else{
            System.out.println(this.name+" used double attack to "+op.name+ "0 damage ");
        }
    };
    @Override
    protected void levelUp(){
        System.out.println(name+" level up!");
//        if(accessory!=null) accessory.levelUp();
        lvl++;
        maxHp=100+(10*lvl);
        maxMana=100+(10*lvl);
        runSpeed= 10 +(2*lvl);
        atk = 20+(2*lvl);
        def = 10+(lvl);
//        if(accessory!=null)  {
//            this.runSpeed-=(accessory.lvl);
//            //buff
//            if(!abilityOn) use;
//        }
    };
}
