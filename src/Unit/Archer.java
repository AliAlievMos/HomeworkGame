package Unit;

import java.util.ArrayList;

public class Archer extends Unit{

    public Archer(String name, int hp, int basicAttack, int basicArmor, int run, int money,int weightMax, ArrayList Backpack) {
        super(name, hp, basicAttack, basicArmor, run, money,weightMax, Backpack);
    }

    public void attack(Unit target){

        if (target.run <= basicAttack){
            System.out.println(target.name + " мертв!"+ "В яблочко!");
            pickUp(target);
            target.hp = 0;
        }
        else{
            System.out.println("Ближний бой!");
             target.attack(this);
        }
    }
}
