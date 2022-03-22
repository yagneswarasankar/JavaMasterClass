package chapters.chapter6.OOP2.HouseComposition;

public class House {
    public Door door;
    public Kitchen kt;
    public House(Kitchen kt,Door door){
        this.door = door;
        this.kt = kt;
    }

    public static void main(String[] args) {
        Kitchen kt = new Kitchen("Marble",4,new Door("Green",new Dimension(12,13,2)));
        Door door = new Door("Red",new Dimension(12,32,4));
        House h  = new House(kt,door);
        kt.getDoor().closeDoor();
        System.out.println(kt.getDoor().getDoorColor());
        System.out.println(kt.getDoor().getDimention().getHeight());
    }
}
