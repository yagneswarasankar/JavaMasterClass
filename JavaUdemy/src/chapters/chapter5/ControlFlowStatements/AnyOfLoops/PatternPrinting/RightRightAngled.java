package chapters.chapter5.ControlFlowStatements.AnyOfLoops.PatternPrinting;

public class RightRightAngled {

    public static void printRightAngledTriangle(int num) {
        System.out.println("RightRightAngled");
        for (int i = 0; i < num; i++) {
            //for(int j= 0; j < num -i; j++){
            for (int j = 2 * (num - i); j >= 0; j--) {
                System.out.print(" ");

            }

            for (int k = 0; k < i; k++) {
                //System.out.print("Values i: "+i + "j: "+ n +"k: "+ k);
                System.out.print(" *");
                //n++;
            }
            System.out.println("");
        }
    }
/*        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j = 2 * (row - i); j >= 0; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }*/
    }

