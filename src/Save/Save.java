package Save;

import Unit.Unit;

import java.io.*;

public class Save implements Serializable {
    private static final long serialVersionUID = 1L;

    private Unit unit;
    Save (Unit unit){
        this.unit = unit;
    }

//    public static void saveUnit(Unit unit){
//
//
//        WriteObject obj = new WriteObject();
//
//        Address address = new Address();
//        address.setStreet("wall street");
//        address.setCountry("united state");
//
//        obj.serializeAddress(address);
//    }
////    PrintWriter writer = new PrintWriter(new File("persons.csv"));
//
//
//
//    private void serializeSave() {
//
//        FileOutputStream fout = null;
//        ObjectOutputStream oos = null;
//
//        try {
//
//            fout = new FileOutputStream("\\ src \\Save \\ Save.txt");
//            oos = new ObjectOutputStream(fout);
//            oos.writeObject(unit);
//
//            System.out.println("Сохранение завершено");
//
//        } catch (Exception ex) {
//
//            ex.printStackTrace();
//
//        } finally {
//
//            if (fout != null) {
//                try {
//                    fout.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//    }
//    public static void loadUnit() {
//        FileInputStream fout = null;
//        ObjectInputStream oos = null;
//
//        try {
//
//            fout = new FileInputStream("\\ src \\Save.Save.ser");
//            oos = new ObjectInputStream(fout);
//            oos.readObject();
//
//            System.out.println("Сохранение загружено");
//
//        } catch (Exception ex) {
//
//            ex.printStackTrace();
//
//        } finally {
//
//            if (fout != null) {
//                try {
//                    fout.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//
//    }
//
//    }
//    public void loadUnit(){
//        return this.unit;
//
//
    }

