package chapters.chapter5.ControlFlowStatements.ForLoop.WaysToHaveForloop;

public class ForLoopDemo {

    public static void main(String[] args) {

        int number = 10;
        int[] numbers = new int[15];
        for(int i  = 0; i< numbers.length;i++){
            numbers[i] = i;
        }

        for(int i = 0; i< number; i++){
            System.out.println("I : "+ i);
        }

        for(int k : numbers){
            System.out.println("K : " + k);
        }

    }
}
