package chapters.chapter5.ControlFlowStatements.LastDigitChecker;

import static chapters.chapter5.ControlFlowStatements.LastDigitChecker.LastDigitChecker.hasSameLastDigit;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (
                9,
                99,
                999));
        System.out.println(hasSameLastDigit  (
                23,
                32,
                42));
        System.out.println(hasSameLastDigit  (
                41,
                22,
                71));

    }
}
