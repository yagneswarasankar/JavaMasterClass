package chapters.chapter7.Arrays.ArrayResizing;

import java.util.Scanner;

public class ArrayResizing {

    private static Scanner scanner = new Scanner(System.in);
    static int[] baseArray;

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        int count = scanner.nextInt();
        System.out.println("Enter "+count+" number(s)");
        getIntegers(count);
        printArray(baseArray);
        System.out.println("Enter New Size: ");
        int newCount = scanner.nextInt();
        arrayResize(newCount);
        System.out.println("Enter extra "+ (newCount - count)+ " elements");
        for(int i=0;i< (newCount - count); i++){
            baseArray[count +i] = scanner.nextInt();
        }
        printArray(baseArray);
    }

    private static void getIntegers(int count){
        baseArray = new int[count];
        for (int i = 0 ; i< count;i++){
            baseArray[i] = scanner.nextInt();
        }

    }

    private static void printArray(int[] array){
        for(int i=0; i <array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

    }

    private static void arrayResize(int count ) {
        int[] originalArray = baseArray;
        baseArray = new int[count];
        System.out.println("Enter " + count + " elements");
        for (int i = 0; i < originalArray.length; i++) {
            baseArray[i] = originalArray[i];
        }

    }


}
