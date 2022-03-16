package chapters.chapter5.UserInput.InputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        int count = 0;
        int num = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                num = scanner.nextInt();
                count += 1;
                sum += num;
                avg = (double) sum / count;

            } else {

                break;
            }

        }
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(avg));
        scanner.nextLine();
    }
}


