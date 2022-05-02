package chapters.chapter7.ArrayLists.AutoUnBoxingChallenge;

import java.util.ArrayList;
public class Bank {

    private String name ;
    private ArrayList<Branch> branches ;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
           // System.out.println("branch not found");
            this.branches.add(new Branch(branchName));
        }
        return false;
     }

     public boolean addCustomer(String branchName, String customerName,double initalAmount) {
         Branch branch = findBranch(branchName);
         if (branch != null) {
             return branch.newCustomer(customerName, initalAmount);
         }
         return false;
     }

     public boolean addCustomerTransaction(String branchName,String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;

     }

    private Branch findBranch(String branchName){

        for(int i = 0; i < branches.size();i++){
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch !=null){
            System.out.println("Customer details for branch : "+ branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomer();
            for(int i = 0; i< branchCustomers.size(); i++){
                Customer barnchCustomer = branchCustomers.get(i);
                System.out.println("Customer :"+ barnchCustomer.getName() + "[ "+(i+1)+" ]");
                if(showTransactions){
                    System.out.println("List of transactions ");
                    ArrayList<Double> transactions = barnchCustomer.getTransaction();
                    for(int j = 0; j < transactions.size();j++){
                        System.out.println("[ "+(j+1)+" ] Amount : "+ transactions.get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }


}
