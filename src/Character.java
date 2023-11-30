public class Character {
    public String name;
    protected double maxHp = 100;
    protected double maxMana = 50;
    protected double runSpeed;
    protected double atk;
    protected double def;
    protected int lvl;
//    Accessory accessory;

    public void attack(Character op){
        if(atk>op.def) {
            double damage = atk-op.def;
            System.out.println(this.name+" attacked "+op.name+" "+damage +" damage ");
            if(op.maxHp<=damage){
                op.maxHp=0;
                this.levelUp();
                System.out.println(op.name+" is dead!");
            }else{
                op.maxHp-=atk-op.def;
            }
        }else{
            System.out.println(this.name+" attacked "+op.name+ "0 damage ");
        }
    };
    protected void levelUp(){
        System.out.println("You level up!");
//        if(accessory!=null) accessory.levelUp();
        lvl++;
        maxHp=100+(10*lvl);
        maxMana=100+(10*lvl);
        runSpeed= 10 +(2*lvl);
//        if(accessory!=null)  {
//            this.runSpeed-=(accessory.lvl);
//            //buff
//            if(!abilityOn) use;
//        }
    };
    public void show(){
        System.out.println("Name :"+name);
        System.out.println("Hp : "+this.maxHp);
        System.out.println("Mana : "+this.maxMana);
        System.out.println("damage : "+ this.atk);
        System.out.println("def : "+ this.def);
        System.out.println("level : "+this.lvl);
        System.out.println("runSpeed : "+this.runSpeed);
//        if(accessory==null) System.out.println("accessory : none");
//        else System.out.println("accessory : "+accessory.name);

    };
}
