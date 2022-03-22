package chapters.chapter5.ControlFlowStatements.AnyOfLoops.LargestPrimeNumber;

import static chapters.chapter5.ControlFlowStatements.AnyOfLoops.LargestPrimeNumber.LargestPrime.getLargestPrime;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(3));
        System.out.println(getLargestPrime(49));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(48));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(28));
        System.out.println(getLargestPrime(86));
    }
}
