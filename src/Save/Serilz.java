package Save;

import Unit.Unit;

import java.io.*;

public class Serilz {

    public static void saveUnit(Unit unit){


        Serilz obj = new Serilz();

        Save save = new Save(unit);

        obj.serializeSave(save);
    }



    private void serializeSave(Save save) {

        FileOutputStream fout = null;
        ObjectOutputStream oos = null;

        try {

            fout = new FileOutputStream(new File("Save.txt"));
            oos = new ObjectOutputStream(fout);
            oos.writeObject(save);

            System.out.println("Сохранение завершено");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public static void loadUnit() {
        FileInputStream fout = null;
        ObjectInputStream oos = null;

        try {

            fout = new FileInputStream("Save.txt");
            oos = new ObjectInputStream(fout);
            oos.readObject();

            System.out.println("Сохранение загружено");

        } catch (Exception ex) {

            ex.printStackTrace();

        } finally {

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}

