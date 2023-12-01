public class Boots extends Accessory{
    public Boots(String name,int lvl){
        super(name,lvl,"Boots");
        runSpeed+=10+(lvl);
        heavy=10+(0.1*lvl);
    }




}
