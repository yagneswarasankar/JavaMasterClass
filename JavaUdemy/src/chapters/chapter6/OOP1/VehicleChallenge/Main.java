package chapters.chapter6.OOP1.VehicleChallenge;

public class Main {
    public static void main(String[] args) {
        Maruthi m = new Maruthi();
        m.setModel("WagonR");

        System.out.println(m.getModel());
        m.changeGearUp();
        m.changeGearUp();
        m.changegGearDown();
        m.speedUp(20);
        m.speedUp(20);
        m.speedDown(20);



    }
}
