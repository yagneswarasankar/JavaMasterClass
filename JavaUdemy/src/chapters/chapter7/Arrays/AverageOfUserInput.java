package chapters.chapter7.Arrays;

import java.util.Scanner;

public class AverageOfUserInput {
    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray  = getNumber(5);
        double avg = getAverage(intArray);
        System.out.println("The average is : "+ avg);
    }

    private static int[] getNumber(int number){
        System.out.println("Enter "+ number +" numbers");
        int[] numbers = new int[number];
        for(int i = 0; i< number;i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i< number; i++){
            System.out.println("Element "+ i +" typed value was  "+ numbers[i]);
        }
        return numbers;

    }

    private static double getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return  (double)sum/(double)arr.length;
    }


}
