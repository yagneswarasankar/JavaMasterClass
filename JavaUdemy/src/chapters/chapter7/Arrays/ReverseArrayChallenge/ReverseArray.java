package chapters.chapter7.Arrays.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array  = new int[] {3,5,6,7,9,5};
        int[] array1  = new int[] {3,5,6,7,9,5,45,6,5};
        int[] array2 = new int[] {5,4,3,2,1};
        reverse(array);
        reverse(array1);
        reverse(array2);

    }

    private static void reverse(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int midValue  = array.length / 2 ;
        int numeOfelements = array.length -1;
        int temp;
        for(int i = 0; i< midValue; i++){
            temp = array[numeOfelements-i];
            array[numeOfelements-i] = array[i];
            array[i] = temp;
        }
        System.out.println("Reversed array = "+ Arrays.toString(array));

    }



}

