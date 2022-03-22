package chapters.chapter6.OOP1.VIPCustomer;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Girija",100,"girija@abc.com");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"first@email.com");
    }
    public VipCustomer(String name,double creditLimit,String emailAddress){
        this.name = name;
        this.creditLimit=creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
