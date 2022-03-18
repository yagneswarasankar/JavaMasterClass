package chapters.chapter6.OOP1.VIPCustomer;

public class Main {
    public static void main(String[] args) {
        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getCreditLimit());
        VipCustomer vip2 = new VipCustomer("Hari",200);
        System.out.println(vip2.getEmailAddress());
        VipCustomer vip3 = new VipCustomer("Srinivas",3000,"sri@gmail.com");
        System.out.println(vip3.getName());

    }
}
