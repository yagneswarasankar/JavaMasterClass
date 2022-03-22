package chapters.chapter6.OOP2.Hamburger;

public class Main {
    public static void main(String[] args) {
   /*  Hamburger h = new Hamburger("Basic","Sausage",3.56,"White");
        System.out.println(h.itemizedHamburger());
        h.addHamburgerAddition1("Tomato",0.27);
        h.addHamburgerAddition2("Lettuce",0.75);
        h.addHamburgerAddition3("Cheese",1.13);
        System.out.println(h.itemizedHamburger());*/

       /* HealthyBurger hb = new HealthyBurger("Basic",3.00);
        hb.addHamburgerAddition1("Lattus",0.23);
        hb.addHealthyHamburgerAddition5("Capsicum",0.6);
        System.out.println(hb.itemizedHamburger());*/

        DeluxBurger db = new DeluxBurger("Basic",5.6,5.4,3);
        System.out.println(db.itemizedHamburger());

    }
}
