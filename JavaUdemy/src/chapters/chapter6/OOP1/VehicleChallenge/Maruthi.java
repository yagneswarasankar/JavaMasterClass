package chapters.chapter6.OOP1.VehicleChallenge;

public class Maruthi extends Car {
    String model;
    public Maruthi(){
        super(1,true,"car",5,0,1);
        this.model = model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}
