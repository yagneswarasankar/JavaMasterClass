package chapters.chapter12.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsProgram {


    public static void main(String[] args) {



        Map<String,String> hashMap = new HashMap<>();

        hashMap.put("Girija","Vizag");
        hashMap.put("Hari","Madhunapuram");
        hashMap.put("Sastry","Bhimavaram");
        hashMap.put("Phani","Madhunapuram");

        System.out.println(hashMap.get("Girija"));
        System.out.println(hashMap.put("Girija","Hyderabad"));
        System.out.println(hashMap.get("Girija"));
        System.out.println(hashMap.put("Prakash","Modekurru"));

        System.out.println("=============================");
  /*      for(String key: hashMap.keySet()){
            System.out.println(key +":"+hashMap.get(key));
        }*/
        hashMap.replace("Prakash","Modekurru1");
        hashMap.replace("Prakash","Modekurru1","Sriramapuram");


        for(String key: hashMap.keySet()){
            System.out.println(key +":"+hashMap.get(key));
        }


       /* for(<String,String> <key><Value>: hashMap){
            System.out.println(key +"->"+ value);
        }*/
    }
}
