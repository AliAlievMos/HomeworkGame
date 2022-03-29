import Fabric.MainFabric;
import Item.Weapon;
import Save.Save;
import Save.Serilz;
import Unit.Archer;
import Unit.Coward;
import Unit.Swordsman;
//
import java.util.ArrayList;

import static Fabric.Fabrics.createArcherFab;
import static Fabric.Fabrics.createSwordsmanFab;

public class Game {
    public static void main (String[] args){
//        Coward basicCoward = new Coward("Обыкновенный трус", 5,5,5, 45, 0,50, new ArrayList<>(4));
//        Swordsman swordsmanKen = new Swordsman("Мечник Кен", 5,5,5, 30,0,50, new ArrayList<>(4)  );
//        basicCoward.escapeFrom(swordsmanKen);
//        Archer elf = new Archer("Эльфийский лучник",3,1,1,3,0,50, new ArrayList<>(4));
//        elf.attack(swordsmanKen);
//        Weapon cd = new Weapon("Aaaa",5, 5,10);
//        Weapon cd1 = new Weapon("бббб",5, 5,10);
//        cd.equipItem(swordsmanKen);
//        cd.equipItem(swordsmanKen);
//        cd.equipItem(swordsmanKen);
//        cd.equipItem(swordsmanKen);
//        cd.equipItem(swordsmanKen);
//        elf.info();
//        cd.equipItem(elf);
//        elf.info();
//        cd1.equipItem(elf);
//        elf.info();
//        swordsmanKen.attack(elf);
//        swordsmanKen.info();
//        swordsmanKen.bpShow();
//        swordsmanKen.attack(elf);
//        Serilz.saveUnit(elf);
//        Serilz.loadUnit();
        MainFabric.warMain(8, "Лучники", 9, "Мечники");




    }
}
