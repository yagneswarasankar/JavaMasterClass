package chapters.chapter11.packages.accessmodifiers;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("12345");
        account.deposit(40);
        account.deposit(60);
        account.deposit(-500);
        account.withdraw((-20));
        account.withdraw(20);
        account.calculateBalance();
        //account.balance = 5000;
        //account.transactions.add(4500);
        account.calculateBalance();

        System.out.println("Current account balance is "+ account.getBalance());

    }


}
