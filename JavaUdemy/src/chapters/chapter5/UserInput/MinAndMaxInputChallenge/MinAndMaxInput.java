package chapters.chapter5.UserInput.MinAndMaxInputChallenge;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        minAndMaxInput();

    }

    public static void minAndMaxInput(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        while(true){
            boolean isInt = sc.hasNextInt();
            if(isInt){
                int number = sc.nextInt();
                if(number < min)
                {
                    min = number;
                }
                if(number > max){
                    max = number;
                }

            }else{
                System.out.println("Final Min Number: "+ min);
                System.out.println("Final Max Number: "+ max);
                break;
            }
            System.out.println("Min Number so far: "+ min);
            System.out.println("Max Number so far: "+ max);
            sc.nextLine();
        }


    }
}
