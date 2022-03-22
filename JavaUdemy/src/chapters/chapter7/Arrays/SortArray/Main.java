package chapters.chapter7.Arrays.SortArray;

import static chapters.chapter7.Arrays.SortArray.SortedArray.sortIntegers;
import static chapters.chapter7.Arrays.SortArray.SortedArray.sortIntegers;

public class Main {
    public static void main(String[] args) {

        int[] numberArray  = SortedArray.getIntegers(6);
        SortedArray.printArray(numberArray);
        int[] sortedArray = sortIntegers(numberArray);
        for(int i = 0; i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }

    }
}
