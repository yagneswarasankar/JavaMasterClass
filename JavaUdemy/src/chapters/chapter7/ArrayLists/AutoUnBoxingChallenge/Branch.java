package chapters.chapter7.ArrayLists.AutoUnBoxingChallenge;

import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
         if(findCustomers(customerName) == null){
             this.customers.add(new Customer(customerName,initialAmount));
             return true;
         }
         return false;

    }

    public boolean addCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = findCustomers(customerName);
        if(existingCustomer != null){
           existingCustomer.addTransaction(amount);
           return true;
        }
        return false;

    }

    private Customer findCustomers(String customerName){

        for(int i = 0; i < customers.size();i++){
            Customer checkedCustomer = customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
              return checkedCustomer;
            }
        }
        return null;
    }





}
