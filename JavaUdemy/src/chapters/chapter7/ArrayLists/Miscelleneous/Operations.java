package chapters.chapter7.ArrayLists.Miscelleneous;

import com.sun.corba.se.spi.orb.Operation;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Operations {

    private static ArrayList<Integer> intgerArray = new ArrayList<Integer>();

    public static void main(String[] args) {

        Operations.addElement(30);
        Operations.addElement(40);
        Operations.addElement(50);
        Operations.removeElement(2);
        Operations.printElement();



    }

    private static void addElement(int k){
        intgerArray.add(k);
    }
    private static void printElement(){
        for(int i = 0; i<intgerArray.size();i++){
            System.out.println(intgerArray.get(i));
        }
    }

    private static int removeElement(int pos){

        int itemPosition = intgerArray.get(pos);
        if(itemPosition >= 0){
           return intgerArray.remove(pos);
        }
        else return -1;
    }




}
