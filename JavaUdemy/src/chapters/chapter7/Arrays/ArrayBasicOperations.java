package chapters.chapter7.Arrays;

public class ArrayBasicOperations {

    public static void main(String[] args) {
        int[] myIntArray = new int[10]; //Array with 10 elements
        int[] myIntArray1 = {1,2,3};
        System.out.println(myIntArray1[0]);
        myIntArray[5] = 5;
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray[4]);//Default value of Integer is 0. so 0
        for(int i = 0; i< myIntArray.length; i++){
            System.out.println("The index of " + i +" value is "+ i * 10);
        }
        System.out.println("******************************************");
        for(int i = 0; i < myIntArray.length;i++){
            myIntArray[i] = i * 20;
        }
        for(int i = 0; i< myIntArray.length;i ++){
            System.out.println("The index of " + i +" value is "+ myIntArray[i]);

        }
        System.out.println("***********************");
     printArray(myIntArray);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println("The number is "+i);
        }
    }



}
