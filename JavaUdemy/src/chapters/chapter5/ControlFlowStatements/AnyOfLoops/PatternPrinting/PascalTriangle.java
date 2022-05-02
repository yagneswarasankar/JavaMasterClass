package chapters.chapter5.ControlFlowStatements.AnyOfLoops.PatternPrinting;

public class PascalTriangle {

    public static void printPascalTriangle(int num){

        for(int i = 0; i< num ; i++){
            for(int j = 0; j< num -i ; j ++){
                System.out.print(" ");
            }
            for(int k = 0;k<= i; k ++){
                System.out.print(factorial(i)/(factorial(k) * factorial(i-k)) +"  ");
            }
            System.out.println("");
        }
    }

    private static int factorial(int k){
        if(k == 0){
            return 1;
        }
       return k * factorial(k - 1);

    }



}
