package chapters.chapter6.OOP1.Inheritance.InheritanceExamples;

public class Species {
    private int brain;
    private int mouth;
    private int senses;

    public Species(int brain, int mouth, int senses) {
        this.brain = brain;
        this.mouth = mouth;
        this.senses = senses;
    }

    public void canTalk(){
        System.out.println("This is from species");
    }

    public void canEat(){
        System.out.println("This is from species ");
    }

    public void canWalk(int speed){
        System.out.println("The species can walk at the speed of "+ speed);

    }

    public void canRun(int speed){
        System.out.println("The species can run at the speed of "+ speed);

    }




}
