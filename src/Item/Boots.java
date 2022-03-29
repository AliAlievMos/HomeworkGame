package Item;

import Unit.Unit;

public class Boots extends Item {
    public int speedBoots;

    public Boots(String name, int durability, int cost, int weight) {
        super(name, durability, cost, weight);
        this.speedBoots = speedBoots;

    }


    public void equipItem(Unit target){
        target.durabilityBoots = 0;

        if (durability > 0){
            target.speedBoots = speedBoots;
        }

    }
}
