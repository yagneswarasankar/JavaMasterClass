package chapters.chapter7.LinkedLists.LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        addCity(cities, "Gurgaan");
        addCity(cities, "Delhi");
        addCity(cities, "Ahmedabad");
        addCity(cities, "Balapur");
        addCity(cities, "Bangalore");
        printLinkedList(cities);
        addCity(cities, "Ahmedabad");
        addCity(cities, "kolkata");
        addCity(cities, "Hyderabad");
        printLinkedList(cities);
        visitCities(cities);
    }

    private static void printLinkedList(LinkedList<String> l) {

        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            System.out.println("Places visited: " + i.next());
        }
        System.out.println("==============================");
    }


    private static boolean addCity(LinkedList l, String newCity) {

        ListIterator<String> stringListIterator = l.listIterator();
        while (stringListIterator.hasNext()) {
            int compareTo = stringListIterator.next().compareTo(newCity);
            if (compareTo == 0) {
                //The element already there in the list
                //No action needed
                System.out.println("City already exists : " + newCity);
                return false;
            } else if (compareTo > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (compareTo < 0) {
                ///No processing needed.

            }


        }
        stringListIterator.add(newCity);
        return true;
    }


    public static void visitCities(LinkedList<String> linkedList) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        System.out.println("Enter the direction you want to go");
        boolean quit = false;
        boolean isGoingForward = true;

        while (!quit) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Holidays ended ");
                    quit = true;
                    break;
                case 1:
                    if(!isGoingForward){
                        if(stringListIterator.hasNext()){
                         stringListIterator.next();
                        }
                        isGoingForward = true;
                    }

                    if (stringListIterator.hasNext()) {
                        System.out.println("Going to visit " + stringListIterator.next());
                    } else {
                        System.out.println("We have reached to the end of the Itenary");
                        isGoingForward = false;
                    }
                    break;
                case 2:
                    if(isGoingForward){
                        if(stringListIterator.hasPrevious()){
                            stringListIterator.previous();
                        }
                        isGoingForward = false;
                    }
                    if (stringListIterator.hasPrevious()) {
                        System.out.println("Going to visit" + stringListIterator.previous());
                    } else {
                        System.out.println("We are at the begining ");
                        isGoingForward = true;
                    }

                    break;
            }
        }

    }

}

