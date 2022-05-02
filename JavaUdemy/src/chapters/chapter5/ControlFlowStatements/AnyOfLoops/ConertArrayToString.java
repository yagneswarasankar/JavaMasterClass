package chapters.chapter5.ControlFlowStatements.AnyOfLoops;

import java.util.Arrays;

public class ConertArrayToString {


    public static void main(String[] args) {

        char[] chrArray = {'a','e','i','o','u'};
        int[] intArray = {1,2,3,4,5};
        System.out.println(convertToString(chrArray));
        System.out.println(convertToString1(chrArray));
        System.out.println(convertToString(intArray));

        System.out.println(convertToStringUsingJoin(chrArray));


     }

    //Character Arrays
    static String convertToString(char[] chrArray){
       return String.valueOf(chrArray);
    }
    static String convertToString1(char[] charArray){
      return Arrays.toString(charArray);
    }

    static String convertToStringUsingJoin(char[] charArray){
        return String.join(new String(charArray));
    }

    //Int Arrays

    static StringBuilder convertToString(int[] intArray) {
        StringBuilder  str= new StringBuilder();
        for (int i = 0; i < intArray.length; i++) {
            str.append(String.valueOf(intArray[i]));

        }
        return str;
    }




}
