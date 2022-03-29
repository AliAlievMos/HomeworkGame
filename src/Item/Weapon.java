package Item;
import Unit.Unit;
public class Weapon extends Item {
        int attack;

    public Weapon(String name, int durability, int cost, int weight) {
        super(name, durability, cost, weight);
        this.attack = attack;
    }

    public void info(){
        System.out.println(name + " атака равна: " + attack + " прочность равна: " + durability );
    }


    public void equipItem(Unit target){
        equip(target);

        if (durability > 0){
            target.attackWeap = attack;
            target.durabilityWeap = durability;
        }

    }
}
