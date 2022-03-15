package chapters.chapter5.ControlFlowStatements.WhileDoWhile.SharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit(int first,int second){
        boolean result = false;
        if(first < 10 || first > 99 || second < 10 ||second >99){
            return false;
        }
        int newSecond = second;
        while(first > 0){
            second = newSecond;
            int remainingFristLeastSignificantDigit = first % 10;
            while(second > 0 && !result){
                int remainingSecondLeastSignificantDigit = second % 10;
                System.out.println("Comparing numbers "+ remainingFristLeastSignificantDigit +
                        " from first number and "+ remainingSecondLeastSignificantDigit
                        +" from second number" );
                if(remainingFristLeastSignificantDigit == remainingSecondLeastSignificantDigit) {
                    result = true;
                }
                second = second / 10;
            }
          first = first/10;

        }
        return result;

    }

}
