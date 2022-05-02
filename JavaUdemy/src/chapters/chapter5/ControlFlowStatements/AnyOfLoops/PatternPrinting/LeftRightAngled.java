package chapters.chapter5.ControlFlowStatements.AnyOfLoops.PatternPrinting;

public class LeftRightAngled {

    public static void printLeftAngledTriangle(int num){
        System.out.println("LeftRightAngled");
        for(int i = 0; i< num ; i ++){
            for(int j = 0; j< i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
