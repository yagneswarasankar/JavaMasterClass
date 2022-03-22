package chapters.chapter6.OOP2.PolymorphismCarChallenge;

public class Main{

    public static void main(String[] args) {
        Car car = new Car("Base Care",8);
        Maruthi m = new Maruthi("Maruthi",4);
        Hundai h = new Hundai("Hundai",4);
        Kia k = new Kia("Kia",4);

        System.out.println(m.startEngine());
        System.out.println(h.accelerate());
        System.out.println(k.brake());


    }
}
class Car {
    private int cylinders;
    private boolean engine;
    private int wheels;
    private String name;

    public Car(String name, int  cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
       return "Car -> : Start engine ";
    }

    public String accelerate(){
        return "Car => acceleratee";
    }
    public String brake(){
        return "Car -> brake";
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Maruthi extends Car{
    public Maruthi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Maruthi -> : Start engine ";
    }

    @Override
    public String accelerate() {
        return "Maruthi -> : accelerate ";
    }

    @Override
    public String brake() {
        return "Maruthi -> : brake ";
    }
}

class Hundai extends Car{
    public Hundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Hundai -> : startEngine ";
    }

    @Override
    public String accelerate() {
        return "Hundai -> : accelerate ";
    }

    @Override
    public String brake() {
        return "Hundai -> : brake ";
    }
}

class Kia extends Car{

    public Kia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Kia -> : startEngine ";
    }

    @Override
    public String accelerate() {
        return "Kia -> : accelerate ";
    }

    @Override
    public String brake() {
        return "Kia -> : brake ";
    }


}
