package chapters.chapter6.OOP2.HouseComposition;

public class Door {
    private String color;

    private Dimension dimension;

    public Door(String color, Dimension dimension) {
        this.color = color;
        this.dimension = dimension;
    }

    public void closeDoor(){
        System.out.println("Closing the door of kitchen");
    }

    public String getDoorColor(){
        return getColor();
    }

    private String getColor() {
        return color;
    }

    public Dimension getDimention() {
        return dimension;
    }
}
