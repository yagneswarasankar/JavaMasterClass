package chapters.chapter6.OOP2.HouseCompositionChallenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int globalRating;

    public Lamp(String style,boolean battery, int globalRating){
        this.battery = battery;
        this.globalRating = globalRating;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle(){
        return this.style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobalRating(){
        return this.globalRating;
    }



}
