package chapters.chapter5.ControlFlowStatements.AnyOfLoops.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReadReturn {
    private static ArrayList<String> values = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = returnStrings();
        System.out.println(list);
    }

    private static ArrayList<String> returnStrings(){
        boolean quit = false;
        int index = 0;
        String str;

        while(!quit){
            System.out.println("Enter the choicice: ");
            int choice  = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter the String :");
                    str = scanner.nextLine();
                    values.add(index,str);
                    index++;
            }



        }
        return values;

    }



}
