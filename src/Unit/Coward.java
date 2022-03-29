package Unit;

import java.util.ArrayList;

public class Coward extends Unit {


    public Coward(String name, int hp, int basicAttack, int basicArmor, int run, int money, int weightMax, ArrayList Backpack) {
        super(name, hp, basicAttack, basicArmor, run, money,weightMax, Backpack);
    }

    public void attack(Unit target) {
            if (run > target.run){
                System.out.println("Ха! Я убежал!");
                if(durabilityBoots > 0)
                durabilityBoots -=1;
            }
            else {
                System.out.println("О, нет нужно драться!");
            }
    }

    public void escapeFrom(Unit killer) {
            if (hp > 0) {
                System.out.println("Я жив! Надо бежать!" + name + " бежит от " + killer.name);
                if (run >= killer.run){
                    System.out.println("Фух, это было не легко, но я убежал");
                    if(durabilityBoots > 0)
                    durabilityBoots -=1;
                }
                else {
                    killer.attack(this);
                }
            }
            else{
                System.out.println("Поздно! Я уже мертв!");

            }
        }






}
