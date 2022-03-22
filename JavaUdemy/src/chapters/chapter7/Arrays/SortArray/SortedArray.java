package chapters.chapter7.Arrays.SortArray;

import java.util.Scanner;
public class SortedArray {
    public int number ;




    public static int[] getIntegers(int number){
         Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[number];
        System.out.println("Enter "+ number +" number");
        for(int i = 0; i< number; i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i< number; i++){
            System.out.println(numbers[i]);
        }
        return numbers;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length;i++){
            System.out.println("Element "+ i +" contents "+ arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] newArray = arr;
        int temp ;
        for(int i = 0;i<arr.length -1; i++){
            for(int j = 0; j< arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }

        }
        return newArray;
    }

}
