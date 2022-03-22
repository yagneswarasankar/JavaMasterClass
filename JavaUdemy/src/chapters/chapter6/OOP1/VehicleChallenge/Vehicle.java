package chapters.chapter6.OOP1.VehicleChallenge;

public class Vehicle {
    private int wheels;
    private String type;
    private Boolean steering;


    public Vehicle(){}

    public Vehicle(int wheels, Boolean steering,String type){
        this.wheels = wheels;
        this.steering = steering;
        this.type = type;
    }

    static boolean hasColor(){
        return true;
    }


}
