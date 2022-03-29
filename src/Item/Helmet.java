package Item;

import Unit.Unit;

public class Helmet extends Item{
    int durabilityHelmArmor;
    public int helmetArmor;

    public Helmet(String name, int durability, int cost,int weight, int helmetArmor) {
        super(name, durability, cost,weight);
        this.helmetArmor = helmetArmor;
    }
    public void equipItem(Unit target){
        equip(target);
        target.durabilityHelmArmor = 0;

        if (durability > 0){
            target.durabilityHelmArmor = durabilityHelmArmor;
            target.helmetArmor = helmetArmor;
        }

    }
}
