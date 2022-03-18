package chapters.chapter6.OOP1.BankAccount;

public class Main {
    public static void main(String[] args) {


        BankAccount ac = new BankAccount();
        BankAccount account = new BankAccount("12345",
                3000,"Girija",
                "abc@gmail.com","(040)-123-45");
        System.out.println(ac.getBalance());
        BankAccount girijaAccount = new BankAccount("Girija","defaultemail","defaultphone");

        System.out.println(girijaAccount.getBalance());
        System.out.println(girijaAccount.getCustomerName());

        BankAccount sriAccount = new BankAccount();

    }
}
