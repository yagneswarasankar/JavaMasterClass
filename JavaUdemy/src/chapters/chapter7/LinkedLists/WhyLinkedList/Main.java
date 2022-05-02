package chapters.chapter7.LinkedLists.WhyLinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Girija",54.0);

        Customer anotherCustomer  = customer;

        anotherCustomer.setBalance(12.6);

        System.out.println("Customer "+ customer.getName() +" balance is "+ customer.getBalance());

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(4);

        //As and when there is a change in the (addition/deletion) all the element of the Arraylist has to be re adjusted.
        //To oever come we have the linked list.

        for(int i =0;i< intArrayList.size();i++){
            System.out.println("The intArray element"+i +" is :"+ intArrayList.get(i));
        }

        intArrayList.add(1,2);

        for(int i =0;i< intArrayList.size();i++){
            System.out.println("The intArray element"+i +" is :"+ intArrayList.get(i));
        }

        intArrayList.remove(2);
        for(int i =0;i< intArrayList.size();i++){
            System.out.println("The intArray element"+i +" is :"+ intArrayList.get(i));
        }

    }

}
