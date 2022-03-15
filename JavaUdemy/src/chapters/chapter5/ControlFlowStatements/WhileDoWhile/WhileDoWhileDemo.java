package chapters.chapter5.ControlFlowStatements.WhileDoWhile;

public class WhileDoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        while(i < 6){
            System.out.println("The value of i is "+ i);
            i++;
        }
        System.out.println("End of while loop");
        for(i = 1 ; i<6; i++){
            System.out.println(i);
        }

        i = 0;
        do{

            System.out.println(i);
            i++;

        }while (i< 6);


    }



}
