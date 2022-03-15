package chapters.chapter5.ControlFlowStatements.ForLoop.SumOddRange;

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean result = false;
        if(number > 0){
            result = number % 2 !=0;
        }
        return result;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || start < 0 || end < 0){
            sum = -1;
        }else{
            for(int i = start; i<= end; i ++){
                if(isOdd(i)){
                    sum += i;
                }
            }
        }
        return sum;

    }
}
