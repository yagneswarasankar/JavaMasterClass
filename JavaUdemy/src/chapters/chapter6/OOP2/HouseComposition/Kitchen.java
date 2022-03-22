package chapters.chapter6.OOP2.HouseComposition;

public class Kitchen {
    private String gasPlatform;
    private int numberOfCupboards;
    private Door door;

    public Kitchen(String gasPlatform, int numberOfCupboards, Door door) {
        this.gasPlatform = gasPlatform;
        this.numberOfCupboards = numberOfCupboards;
        this.door = door;
    }



    public String getGasPlatform() {
        return gasPlatform;
    }

    public int getNumberOfCupboards() {
        return numberOfCupboards;
    }

    public Door getDoor() {
        return door;
    }
}
