package chapters.chapter6.OOP1.Inheritance.InheritanceExamples;

public class Main {
    public static void main(String[] args) {
        Species sc = new Species(1,1,1);
        Humans h = new Humans(1,1,1,2,1,2);
        h.canTalk();

        h.canWalk(10);
        h.canRun(30);

    }
}
