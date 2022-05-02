package chapters.chapter9.AbstractClasses.AbastractClassIntro;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(" I can not fly. May be I will smim");
    }
}
