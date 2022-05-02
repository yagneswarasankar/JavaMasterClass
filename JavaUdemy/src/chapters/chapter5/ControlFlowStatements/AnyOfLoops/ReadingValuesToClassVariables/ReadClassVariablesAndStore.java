package chapters.chapter5.ControlFlowStatements.AnyOfLoops.ReadingValuesToClassVariables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadClassVariablesAndStore {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> values = new ArrayList<String>();
    private static int studentId;
    private static String name;

    public ReadClassVariablesAndStore(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReadClassVariablesAndStore{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }


    public static ArrayList<String> readValues(){
        boolean quit = false;
        String str ;
        int index =0;
        System.out.println("Enter the choice");
        int choice  = scanner.nextInt();
        scanner.nextLine();
        switch(choice) {
            case 0:
                quit = true;
                break;
            case 1:
                System.out.println("Enter the String :");
                str = scanner.nextLine();
                values.add(index,str);
                index++;
        }


        return values;

    }

}
