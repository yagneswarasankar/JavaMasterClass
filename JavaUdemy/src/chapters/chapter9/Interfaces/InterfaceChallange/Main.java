package chapters.chapter9.Interfaces.InterfaceChallange;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player girija = new Player("Girija",10,5);
        System.out.println(girija.toString());
        saveObject(girija);

        girija.setHitPoints(8);
        System.out.println(girija.toString());
        girija.setWepon("Knife");
        saveObject(girija);
        loadObject(girija);
        System.out.println(girija);
      /*  Player hari = new Player("Hari",430,23);
        hari.read(readValues());
        loadObject(hari);
        System.out.println(hari);*/

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to Storage Devise");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}

