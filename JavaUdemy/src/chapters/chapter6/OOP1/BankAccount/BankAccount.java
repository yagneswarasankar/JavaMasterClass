package chapters.chapter6.OOP1.BankAccount;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public BankAccount(String number,double balance,
                       String customerName,String email,
                       String phoneNumber){
        System.out.println("Constructors with parameters called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber=phoneNumber;

    }
    public BankAccount(){
        this("12345",
                2000,"Girija",
                "abc@gmail.com","(040)-123-45");

        System.out.println("this empty constructor called");

    }

    public BankAccount(String customerName,String email,String phoneNumber){
        this("99999",1000,customerName,email,phoneNumber);

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double amount){
        balance += amount;
    }

    public void withDrawMonday(double amount){
        if(balance - amount <0)
            System.out.println("No sufficeint funds. Balance is :"+ balance);
        else{

            balance -= amount;
            System.out.println("Withdrawl processed the current balance is : "+balance);
        };
    }
}
