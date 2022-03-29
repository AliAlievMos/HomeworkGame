package Fabric;

import java.util.ArrayList;
import java.util.List;

import static Fabric.Fabrics.createArcherFab;
import static Fabric.Fabrics.createSwordsmanFab;

public class MainFabric {
    public static void warMain(int fArmyQ, String fArmyName, int sArmyQ, String sArmyName){
        ArrayList a = createArcherFab(fArmyQ, fArmyName);
        ArrayList b = createSwordsmanFab(sArmyQ, sArmyName);
        War.war(a,b,fArmyName,sArmyName);
    }
}
