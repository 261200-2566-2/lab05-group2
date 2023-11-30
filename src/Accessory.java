public class Accessory {
    String name;
    double heavy;
    int lvl=0;
    boolean abilityOn;
    void levelUp(){
        lvl++;
        heavy*=0.9;
    };
    void show(){
        System.out.println("name : "+name);
        System.out.println("damage : "+swordDamage);
        System.out.println("level :"+lvl);
    };
}
