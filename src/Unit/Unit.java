package Unit;

import Item.Armor;
import Item.Weapon;
import Item.Boots;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Unit implements Serializable {

    public String name;
    public int hp;
    public int basicAttack;
    public int basicArmor;
    public int durabilityWeap = 0;
    public int attackWeap;
    public int durabilityArmor = 0;
    public static int armorArmor;
    public int run;
    public int money;
    public int helmetArmor;
    public int durabilityHelmArmor = 0;
    public int speedBoots;
    public int durabilityBoots;
    public static ArrayList Backpack;
    public Weapon weapon;
    public int weightMax;



//    public static void Pack(Item drop){
//        Backpack.add(drop);
//    }
//    public void Pack(Unit this){
//        ArrayList Pack = new ArrayList();
//        System.out.println("Он точно в рюкзаке!" + Pack.get(0) );
//
//
//    }
//





    public Unit(String name, int hp, int basicAttack, int basicArmor, int run, int money,int weightMax, ArrayList Backpack) {
        this.name = name;
        this.hp = hp;
        this.basicAttack = basicAttack;
        this.basicArmor = basicArmor;
        this.run = run;
        this.money = money;
        this.weightMax = weightMax;
        this.Backpack = Backpack;


    }

    public void info() {
        System.out.println("Имя: " + name +
                " Здоровье: " + hp +
                " Атака: " + (ChkAttack(durabilityWeap,attackWeap)) +
                " Броня: " + (ChkArmor(this))) ;

    }


    public void attack(Unit target) {
        ChkAttack(durabilityWeap, attackWeap);
        ChkArmor(target);
        int damage = ChkAttack(durabilityWeap, attackWeap) - ChkArmor(target);
        if (target.hp <= 0) {
            System.out.println("Он мертв! С ним уже не подерешься!");
        }
        else if (target.hp > 0) {

            if (damage > 0) {
                target.hp -= damage;
                System.out.println(name + " наносит " + damage + " урона!");
                if (target.hp <= 0) {
                    System.out.println(target.name + " мертв!");
                    pickUp(target);
                    this.Drop(target);

                }
            } else if (damage <= 0) {
                System.out.println(name + " не пробил броню " + target.name);
            }
            if (durabilityWeap > 0)
                durabilityWeap = durabilityWeap - 1;
            if (target.durabilityArmor > 0)
                target.durabilityArmor = target.durabilityArmor - 1;
            if (target.durabilityArmor > 0)
                target.durabilityHelmArmor = target.durabilityHelmArmor - 1;

        }
    }




    public void pickUp (Unit target){
        money = money + target.money;
        if (target.durabilityArmor > 0) {
            System.out.println(name + "взял броню" + target.name);
            InventoryArmor(target);
            target.durabilityArmor = 0;
            target.armorArmor = 0;
            target.money = 0;

        } else {
            System.out.println("У этого бедолаги брони нет!");
        }
        if (target.durabilityWeap > 0) {
            System.out.println(name + " взял оружие " + target.name);
            InventoryWeap(target);
            target.durabilityWeap = 0;
            target.attackWeap = 0;
        } else {
            System.out.println(" У этого бедолаги оружия нет! ");
        }
        if (target.durabilityHelmArmor > 0) {
            System.out.println(name + " взял шлем " + target.name);
            InventoryHelm(target);
            target.durabilityHelmArmor = 0;
            target.helmetArmor = 0;
        } else {
            System.out.println(" У этого бедолаги на голове ничего нет! ");
        }
        if (target.durabilityBoots > 0) {
            System.out.println(name + " взял шлем " + target.name);
            InventoryBoots(target);
            target.durabilityBoots = 0;
            target.speedBoots = 0;
        } else {
            System.out.println(" Этот бедолага босой!");
        }


    }


    public int ChkAttack ( int durabilityWeap, int attackWeap ){
        if (durabilityWeap <= 0) {
            int allAttack = basicAttack;
            return allAttack;
        } else {
            int allAttack = basicAttack + attackWeap;
            return allAttack;
        }
    }
    public int ChkArmor (Unit target){
        if (target.durabilityArmor <= 0 & target.durabilityHelmArmor <= 0) {
            int allArmor = target.basicArmor;
            return allArmor;
        }
        if (target.durabilityArmor >= 0 & durabilityHelmArmor <= 0) {
            int allArmor = target.basicArmor + target.armorArmor;
            return allArmor;
        }
        else {
            int allArmor = basicArmor + helmetArmor;
            return allArmor;
        }
    }
    private void InventoryBoots(Unit target) {
        Boots enemyBoots = new Boots("Какие-то вражеские сапоги",durabilityBoots, 0,
                target.speedBoots);
        System.out.println(enemyBoots.name + " отправляется в рюкзак " +
                " дополниельная скорость: " + target.attackWeap +
                " прочность равна: " + target.durabilityWeap );
        Backpack.add(enemyBoots);
    }

    static void InventoryWeap (Unit target){
        Weapon enemyWeap = new Weapon("Какое-то вражеское оружие",target.durabilityWeap, 0,
                target.attackWeap);
        System.out.println(enemyWeap.name + " отправляется в рюкзак " +
                " его атака составляет: " + target.attackWeap +
                " его прочность равна: " + target.durabilityWeap );
        Backpack.add(enemyWeap);

    }
    static void InventoryArmor (Unit target){
        Armor enemyArm = new Armor("Какя-то вражеская броня", target.durabilityArmor,0,
                target.armorArmor);
        System.out.println(enemyArm.name +
                " его защита составляет: " + target.armorArmor+
                " его прочность равна: " + target.durabilityArmor );
        Backpack.add(enemyArm);


    }
    static void InventoryHelm (Unit target){
        Armor enemyHelm = new Armor("Какой-то вражеский шлем", target.durabilityHelmArmor,0,
                target.helmetArmor);
        System.out.println(enemyHelm.name +
                " его защита составляет: " + target.armorArmor+
                " его прочность равна: " + target.durabilityArmor );
        Backpack.add(enemyHelm);

    }
    public void Drop (Unit target) {
        money += target.money;

    }

    public void bpShow() {
        System.out.println("В рюкзаке: " + Backpack.get(0));
//        Backpack.get(1);
//        Backpack.get(2);
//        Backpack.get(3);
//        Backpack.get(4);
    }
}