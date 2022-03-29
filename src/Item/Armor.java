package Item;
import Unit.Unit;

public class Armor extends Item {
    int armor;
    public Armor(String name, int durability, int cost, int weight) {
        super(name, durability, cost, weight);
        this.armor = armor;
    }

    public void equipItem(Unit target){
        if (durability > 0){
            target.durabilityArmor = armor;
            target.armorArmor = armor;
            System.out.println(target.name + " получает " + name);
        }
        if (durability <= 0){
            System.out.println(name + " cломано!");
        }

    }

}
