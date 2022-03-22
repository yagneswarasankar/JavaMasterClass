package chapters.chapter4.ExpStatementMethods.IntEqualityPrinter;

public class IntEqualityPrinter {
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            boolean first = (a == b);
            boolean second = (b == c);
            boolean third = (c == a);
            if (first && second) {
                System.out.println("All numbers are equal");
            }else if(first || second || third){
                System.out.println("Neither all are equal or different");
            }else {
                System.out.println("All numbers are different");
            }
        }
    }
}
