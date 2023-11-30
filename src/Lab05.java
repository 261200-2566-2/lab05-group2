public class Lab05 {
    public static void main(String[] args) {
        Mage wayu = new Mage("wayu", null);
        Thief non = new Thief("non", null);
        System.out.println("Show hero after created /////////////");
        wayu.show();
        non.show();

        System.out.println("Attack phase ///////////////////");

        non.attack(wayu);
        wayu.attack(non);
        wayu.magicAttack(non);
        wayu.magicAttack(non);
        non.doubleAttack(wayu);

        wayu.show();
        non.show();

        System.out.println("Dead and lvl up phase/////////////////");
        non.doubleAttack(wayu);
        non.doubleAttack(wayu);
        non.show();
    }
}
