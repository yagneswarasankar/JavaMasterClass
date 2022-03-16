package chapters.chapter5.UserInput;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while( true){
            int order = counter + 1;
            System.out.println("Enter the number #"+order);

            if(sc.hasNextInt()) {
                sum += sc.nextInt();
                counter++;

            }else {
                System.out.println("Invalid Number");
                break;
            }
            sc.nextLine();
        }


        System.out.println("The sum of the numbers is : " + sum);
        sc.close();


    }
}
