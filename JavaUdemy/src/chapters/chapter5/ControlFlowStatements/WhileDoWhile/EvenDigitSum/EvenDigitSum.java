package chapters.chapter5.ControlFlowStatements.WhileDoWhile.EvenDigitSum;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int leastSignificantNumber = number % 10;
            if (leastSignificantNumber % 2 == 0)
                sum += leastSignificantNumber;
            number /= 10;
        }
        return sum;
    }
}
