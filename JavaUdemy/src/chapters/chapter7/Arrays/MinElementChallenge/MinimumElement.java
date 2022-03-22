package chapters.chapter7.Arrays.MinElementChallenge;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number");
        int numOfElements = readInteger();
        int[] elements = readElements(numOfElements);
        System.out.println("Minimum Element is : " + findMin(elements));

    }

    private static int readInteger() {
        return scanner.nextInt();
    }

    private static int[] readElements(int n) {

        int[] intArray = new int[n];
        System.out.println("Enter " + n + " elements ");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] intArray) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min)
                min = intArray[i];
        }
        return min;
    }


}
