package chapters.chapter6.OOP2.Hamburger;

public class HealthyBurger extends Hamburger{

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    //private double hamburgerPrice;



    public HealthyBurger(String meat, double price) {
        super("Healty", meat, price, "Brown rye");

    }

    public void addHealthyHamburgerAddition5(String name,double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHealthyHamburgerAddition6(String name,double price){
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.addition5Name != null) {
            hamburgerPrice += addition5Price;
            System.out.println("Added " + this.addition5Name + " for an extra " + this.addition5Price);
        }
        if (this.addition6Name != null) {
            hamburgerPrice += addition6Price;
            System.out.println("Added " + this.addition6Name + " for an extra " + this.addition6Price);
        }
        return hamburgerPrice;
    }







}


