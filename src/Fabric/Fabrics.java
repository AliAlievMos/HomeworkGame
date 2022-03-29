package Fabric;


import java.util.ArrayList;
import java.util.List;
import Unit.Swordsman;
import Unit.Archer;

public class Fabrics  {
    String name;
    public static int random1 = 8 + (int) Math.random() * 8;
    public static int random2 = 3 + (int) Math.random() * 5;
    public static int random3 = 10 + (int) Math.random() * 13;

    public static ArrayList createSwordsmanFab(int x, String name){


        ArrayList swrArmy = new ArrayList<Swordsman>();
        for (int i = 0;i < x;i++){
            int random1 = 8 + (int) Math.random() * 8;
            int random2 = (int) (3 + Math.random() * 5);
            Swordsman swordsman = new Swordsman("Мечнк",random1,random1,random1,random2,random1,random1, new ArrayList<>(3));
            swrArmy.add(swordsman);
        }
        return swrArmy;
    }
    public static ArrayList createArcherFab(int x, String name) {

        ArrayList<Archer> archersArmy = new ArrayList<Archer>();
        for (int i = 0; i < x; i++) {
            int random2 = (int) (3 + Math.random() * 5);
            int random3 = 10 + (int) Math.random() * 13;
            Archer archer = new Archer("Мечнк", random2, random2, random2, random3, random2, random2, new ArrayList<>(3));
            archersArmy.add(archer);
        }
        return archersArmy;
    }



}
