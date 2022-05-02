package chapters.chapter5.ControlFlowStatements.ReverseName;

import java.util.Scanner;

public class ReverseString {


    private static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the name : ");
        String str = sc.nextLine();
        String[] stringArray = str.split(" ");
        for(int i = stringArray.length -1 ; i>=0; i--){
            System.out.print(stringArray[i]+" ");
        }
    }
}
