package chapters.chapter7.ArrayLists.AutoUnBoxingChallenge;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        if(!bank.addBranch("Hyderabad")){
            System.out.println("Hyderabad branch created");
        }
        bank.addCustomer("Hyderabad","Girija",50);
        bank.addCustomer("Hyderabad","Hari",202.12);
        bank.addCustomer("Hyderabad","Phani",543.23);

        bank.addBranch("Vizag");
        bank.addCustomer("Vizag","Krishna",40.43);


        bank.addCustomerTransaction("Hyderabad","Girija",50.23);
        bank.addCustomerTransaction("Hyderabad","Girija",143.12);
        bank.addCustomerTransaction("Hyderabad","Girija",250.23);
        bank.addCustomerTransaction("Hyderabad","Hari",73.12);
        bank.addCustomerTransaction("Hyderabad","Hari",250.23);
        bank.addCustomerTransaction("Hyderabad","Hari",343.12);


        bank.listCustomers("Hyderabad",true);

        bank.listCustomers("Vizag",true);

        if(!bank.addCustomer("Vijayawada","Tim",540.3)){
            System.out.println("Vijayawada Branch does not exists");
        }
        if(!bank.addBranch("Hyderabad")){
            System.out.println("Hydrabad branch already exists");
        }




    }

}
