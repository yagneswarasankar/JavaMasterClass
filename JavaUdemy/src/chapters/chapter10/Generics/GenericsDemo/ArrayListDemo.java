package chapters.chapter10.Generics.GenericsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

    //Type
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);

        printDouble(arrayList);
    }

    private static void printDouble(ArrayList<Integer> arrList){
        for(int o: arrList){
            System.out.println(o+ 2);
        }
    }

/*    private static void printValuesGeneric(ArrayList<T> arr){

        for(<T> o: arr){
            System.out.println((T) o);
        }


    }*/
}
