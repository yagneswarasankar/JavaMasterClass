package chapters.Miscelleneous.WaysToDeclare.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class VariousWaystoInitializeArrays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        ArrayList<Integer> intArrayList = new ArrayList(Arrays.asList(1,2,3,4,5));

        System.out.println(Arrays.toString(intArray));
        System.out.println(intArrayList);
        for (int i = 1, j = 10; i <= 10 && j > 0; i-- , j--) {
            System.out.println("Inside For Loop");
        }



    }
}
