package chapters.chapter6.OOP1.CarpetCostCalculator;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = (length < 0 ?0 : length);
        this.width = (width < 0?0 : width);
    }

    public double getArea(){
        return length * width;
    }

}
