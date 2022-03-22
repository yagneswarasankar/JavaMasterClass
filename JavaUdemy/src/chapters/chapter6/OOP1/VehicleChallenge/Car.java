package chapters.chapter6.OOP1.VehicleChallenge;

public class Car extends Vehicle{


    private int doors;
    private int speed = 0;
    private int currentGear = 1;


    public Car(int wheels, boolean steering,String type,int doors,int speed,int currentGear){
        super(wheels,steering,type);
        this.doors = doors;
        this.speed = speed;
        this.currentGear = currentGear;

    }


    static boolean handSteering(){
        return true;
    }

    public void changeGearUp(){
        currentGear +=1;
        System.out.println("changed gear from "+ (currentGear-1) +" The current gear is : "+ currentGear);
    }
    public void changegGearDown(){
        System.out.println("changed gear from "+ (currentGear) +" The current gear is : "+ (currentGear-1));
        ;
    }
    public void speedUp(int speed){
        this.speed += speed;
        System.out.println("speed increased by "+ speed +"The current speed of the vehicle is "+ this.speed +" current Gear is "+this.currentGear);

    }

    public void speedDown(int speed){
        this.speed -= speed;
        System.out.println("speed decreased by "+ speed +" The current speed of the vehicle is "+ this.speed+" current Gear is "+this.currentGear);


    }

}
