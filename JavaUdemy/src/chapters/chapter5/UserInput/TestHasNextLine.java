package chapters.chapter5.UserInput;

import java.util.Scanner;

public class TestHasNextLine {
    public static void main(String[] args) {

        int counter = 0;
        System.out.println("counter "+ counter);

        Scanner sc  = new Scanner(System.in);

        while(true) {
            int order = counter + 1;
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                counter++;
                System.out.println("Order :" + order);
                System.out.println("Counter :" + counter);
            } else {
                System.out.println("Invalid number");
                System.out.println("Order :" + order);
                System.out.println("Counter :" + counter);
            }
           // sc.nextLine();
            if(counter > 3){
                break;
            }
        }
      }
    }

