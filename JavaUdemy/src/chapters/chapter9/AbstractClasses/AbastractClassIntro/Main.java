package chapters.chapter9.AbstractClasses.AbastractClassIntro;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Puppy");
        dog.breath();
        dog.eat();

        Parrot bird = new Parrot("Parrot");
        bird.breath();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breath();
        penguin.eat();
        penguin.fly();
    }

}
