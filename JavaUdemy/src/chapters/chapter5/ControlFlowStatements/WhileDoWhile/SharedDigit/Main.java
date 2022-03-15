package chapters.chapter5.ControlFlowStatements.WhileDoWhile.SharedDigit;

import static chapters.chapter5.ControlFlowStatements.WhileDoWhile.SharedDigit.SharedDigit.hasSharedDigit;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(22,12));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int first,int second){
        boolean result = false;
        if(first < 10 || first > 99 || second < 0 ||second >99){
            return false;
        }

        int first1 = first % 10;
        int first2 = first / 10;
        int second1 = second % 10;
        int second2 = second / 10;

        return (first1 == second1 || first2 == second2 || first1 == second2 || first2 == second1);


    }
}
