package chapters.chapter5.ControlFlowStatements.AnyOfLoops.GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        int result = 1;
        if(first < 10 || second < 10){
            return -1;
        }
        int minimumNumber = Math.min(first,second);
        for(int i = 2; i<= minimumNumber ; i++){
            if( first % i == 0 && second % i == 0)
                result = i;
        }
        return result;
        }
    /*public static int getMinimumNumber(int a, int b){
        return (a < b)? a: b;
    }*/

}
