package chapters.chapter9.AbstractClasses.AbastractClassIntro;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breath() {
        System.out.println("Breath in Breath out reapead");
    }

    abstract void fly();


}
