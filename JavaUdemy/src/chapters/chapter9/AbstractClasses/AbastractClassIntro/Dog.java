package chapters.chapter9.AbstractClasses.AbastractClassIntro;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" is Eating ");
    }

    @Override
    public void breath() {
        System.out.println("Breath in , Breath out repeat");
    }
}
