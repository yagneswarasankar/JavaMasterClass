package chapters.chapter7.ArrayLists.AutoUnBoxing;

import java.util.ArrayList;

public class AutoBoxing {



    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        //intArrayList.add(5);

        for (int i = 0; i< 10 ; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i< 10 ; i++){

            System.out.println(i + "-->" + intArrayList.get(i).intValue());

        }
    }

}
