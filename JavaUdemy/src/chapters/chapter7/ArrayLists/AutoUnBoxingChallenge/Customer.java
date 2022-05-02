package chapters.chapter7.ArrayLists.AutoUnBoxingChallenge;

import java.util.ArrayList;

public class Customer {
   private String name ;
   private ArrayList<Double> transaction ;

    public Customer(String name, double initalAmount) {
        this.name = name;
        transaction = new ArrayList<Double>();
        addTransaction(initalAmount);
    }



    public void addTransaction(double amount){
       this.transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
