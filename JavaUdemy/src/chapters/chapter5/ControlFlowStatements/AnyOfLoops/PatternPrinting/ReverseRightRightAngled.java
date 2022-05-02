package chapters.chapter5.ControlFlowStatements.AnyOfLoops.PatternPrinting;

public class ReverseRightRightAngled {

    public static void printReverseRightRightAngledTriangle(int num){

        for(int i = 0; i< num;i++){
            for(int j =  num -i;j>0;j--){
                System.out.print("* ");
            }
            for(int k = 0; k <= i ;k++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
