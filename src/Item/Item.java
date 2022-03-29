package Item;

import Unit.Unit;

public abstract class Item {
    public String name;
    public int durability;
    public int cost;
    public int weight;

    public Item(String name, int durability, int cost, int weight){
        this.durability = durability;
        this.name = name;
        this.cost = cost;
        this.weight = weight;

    }
    public void equip(Unit target){
        if (target.weightMax + weight <= target.weightMax){
        target.durabilityWeap = 0;

          if (durability > 0){
            System.out.println(target.name + " получает " + name);
          }
          if (durability <= 0){
            System.out.println(name + " cломано!" + " Не бери, зачем оно тебе?");
          }

        }
        else {

            System.out.println("Слишком много предметов не могу это взять!");
        }

    }
}
