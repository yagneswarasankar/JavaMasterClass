package chapters.chapter7.ArrayLists.GroceryList;

import java.util.Scanner;

public class Main {

private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("The Choice to enter: \n" +
            "1. Add element to grocery list" +
            "2. Print elements of grocery list" +
            "3. Modify elements of grocery list" +
            "4. remove elements of grocery list" +
            "5. Search for elements in grocery list" +
            "6. quit" );

    GroceryList groceryList = new GroceryList();

    System.out.println("Enter the coice: ");
    boolean quit = true;

    while(quit){
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                addGroceryItem();
                break;
/*
            case 2:
                printGroceryItem();
                break;
            case 3:
                modifyGroceryItem();
                break;
            case 4:
                removeGroceryItem();
                break;
            case 5:
                seaerchGroceryItem();
                break;
            case 6:
                quit = true;
                break;
*/

        }


    }




    }
    private static void addGroceryItem(){

    }
}
