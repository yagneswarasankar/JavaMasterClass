package chapters.chapter5.ControlFlowStatements.ForLoop.CalculateInterest;

public class CalculateInterest {
    public static void main(String[] args) {
        for (int i = 2;i < 9 ; i++ ) {

            System.out.println("10000 at "+i+"% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println("**************************" );
        for (int i = 8;i >1  ; i--) {

            System.out.println("10000 at "+i+"% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
    }
    private static double calculateInterest(double amount,
                                            double percentage){

        return (amount * (percentage/ 100));
    }
}
