package chapters.chapter7.Arrays.ReferenceVsValueTypes;

import java.util.Arrays;

public class ReferenceVsValue {

    public static void main(String[] args) {

        int[] array = new int[5];
        int[] anotherArray = array;


        System.out.println("array "+Arrays.toString(array));
        System.out.println("another Array : "+Arrays.toString(anotherArray));

        array[2] = 2;

        System.out.println("after adding array "+Arrays.toString(array));
        System.out.println("another Array : "+Arrays.toString(anotherArray));

        modifyArray(array);
        System.out.println("After calling modify array "+Arrays.toString(array));
        System.out.println("After calling modify another Array : "+Arrays.toString(anotherArray));

         anotherArray = new int[] {1,2,3,4,5};

        System.out.println("array "+Arrays.toString(array));
        System.out.println("another Array : "+ Arrays.toString(anotherArray));


       /* double[] doubleArray = new double[5];
        System.out.println(Arrays.toString(doubleArray));

        char[] charArray = new char[5];
        System.out.println(Arrays.toString(charArray));

        String[] strArray = new String[5];
        System.out.println(Arrays.toString(strArray));

        System.out.println('\u0000');*/





    }
    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}
