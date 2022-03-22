package chapters.chapter6.OOP2.Hamburger;

public class DeluxBurger extends HealthyBurger{
    private double drinks;
    private double chips;
    private double price ;

    public DeluxBurger(String meat, double price, double drinks, double chips) {
        super(meat, price);
        this.drinks = drinks;
        this.chips = chips;
    }

    public double itemizedHamburger(){

        System.out.println("Delux hamburguer with Drinks and chips price as "/*+ (this.price + this.drinks + this.chips)*/);


        return this.price + this.drinks + this.chips;
    }
}
