package chapters.chapter5.ControlFlowStatements.WhileDoWhile.DigitSumChallenge;

public class DigitSum {
    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-15));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(1264));
    }
    public static int sumDigits(int number) {

        int sum = 0;
        if (number < 10) {
            return -1;
        }

            while (number > 0) {
                sum += number % 10;
                number = (number /= 10);
            }
        return sum;
    }

}
