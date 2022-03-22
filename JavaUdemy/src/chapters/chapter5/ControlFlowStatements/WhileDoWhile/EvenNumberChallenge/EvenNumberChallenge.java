package chapters.chapter5.ControlFlowStatements.WhileDoWhile.EvenNumberChallenge;

public class EvenNumberChallenge {
    public static void main(String[] args) {

        System.out.println(isEven(-1));
        System.out.println(isEven(2));
        System.out.println(isEven(5));

        int start = 5;
        int finishNumber = 20;
        int count = 0;
        while(start < finishNumber){
            start++;
            if(!isEven(start)) {
                continue;
            }
            count++;
            System.out.println("Even number "+ start);
            if(count == 5) {
                break;
            }
        }
        System.out.println("The total number of even number are :" + count);

    }
    public static boolean isEven(int number){
        boolean result = false;
        if(number > 0){
            result = number % 2 == 0;
        }
        return result;
    }
}
