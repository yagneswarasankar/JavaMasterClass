package chapters.chapter5.ControlFlowStatements.AnyOfLoops.NumberToWords;

public class NumberToWords {

    public static void numberToWords(int number) {

        if(number < 0){
            System.out.println("Invalid Value");
        }
        int orderInWhichNumbetToBePrinted = reverse(number);
        int differenceInNumbebrOfDigist = getDigitCount(number) - getDigitCount(orderInWhichNumbetToBePrinted);

        if (orderInWhichNumbetToBePrinted == 0) {
            System.out.println("Zero");
        }

            while (orderInWhichNumbetToBePrinted != 0) {
                switch (orderInWhichNumbetToBePrinted % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                orderInWhichNumbetToBePrinted /= 10;
            }

        if (differenceInNumbebrOfDigist > 0) {
            while (differenceInNumbebrOfDigist != 0) {
                System.out.println("Zero");
                differenceInNumbebrOfDigist--;
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse = (reverse * 10)+(number % 10);
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count  = 0;
        if(number == 0)
            return  1;
        if(number < 0)
            return -1;

        while(number !=0){
            number /= 10;
            count++;
        }
        return count;
    }

}
