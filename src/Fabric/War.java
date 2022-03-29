package Fabric;

import Unit.Unit;
import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class War {
    static void war(ArrayList f, ArrayList s,String fArmyName,String sArmyName){
        try {
            do {
                int i = (int) (Math.random() * (f.size()));
                int i1 = (int) (Math.random() * (s.size()));
                ((Unit) (f.get(i))).attack(((Unit) s.get(i1)));
                if (((Unit) (f.get(i))).hp <= 0) {
                    f.remove((f.get(i)));
                }
                if (((Unit) (s.get(i1))).hp <= 0) {
                    s.remove((s.get(i1)));
                }


            } while (false == f.isEmpty() | false == s.isEmpty());
        } catch (IndexOutOfBoundsException e){
            if (f.isEmpty()){
                System.out.println("ПОБЕДИЛИ"+ sArmyName);
            }if (s.isEmpty()){
                System.out.println("ПОБЕДИЛИ" + fArmyName);
            }

        }



//        while (f.isEmpty() | s.isEmpty());
        if (f.isEmpty()){
            System.out.println("Победили"+ sArmyName);
        }if (s.isEmpty()){
            System.out.println("Победили" + fArmyName);
        }

    }


}
