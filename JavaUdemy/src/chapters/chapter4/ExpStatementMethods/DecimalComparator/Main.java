package chapters.chapter4.ExpStatementMethods.DecimalComparator;

import static sun.invoke.util.ValueConversions.cast;

public class Main {
    public static void main(String[] args) {
        System.out.println("(-3.1756, -3.175) :" +DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("(3.175, 3.176) :" + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("(3.0, 3.0) :" + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("(-3.123, 3.123) :" + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
