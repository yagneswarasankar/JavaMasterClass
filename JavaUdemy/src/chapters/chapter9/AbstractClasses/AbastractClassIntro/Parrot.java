package chapters.chapter9.AbstractClasses.AbastractClassIntro;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println("The bird is flying");
    }
}
