package chapters.chapter5.ControlFlowStatements.AnyOfLoops.PatternPrinting;

public class ReverseLeftRightAngled {

    public static void printReverseLeftRightAngledTriangle(int num){

        for(int i =0;i<num;i++){
            for(int j = 0;j< num -i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}
