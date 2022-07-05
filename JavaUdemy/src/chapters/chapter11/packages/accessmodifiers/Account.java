package chapters.chapter11.packages.accessmodifiers;

import java.util.ArrayList;

public class Account {

    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){

        if(amount > 0){
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println(amount +" is deposited. The balance is "+ this.balance);
        }else{
            System.out.println("Cannot deposit 0 or lessthan");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn and the balance is : "+ this.balance);
        }else{
            System.out.println("Cannot withdraw negative number");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for(int amount : this.transactions){
            this.balance += amount;
        }
        System.out.println("Calculated balance is : "+ this.balance);
    }


}
