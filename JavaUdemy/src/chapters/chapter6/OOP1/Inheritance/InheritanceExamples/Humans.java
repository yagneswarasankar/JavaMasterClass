package chapters.chapter6.OOP1.Inheritance.InheritanceExamples;

public class Humans extends Species{
    private int legs;
    private int tongue;
    private int eyes;

   public Humans(int brain, int mouth, int senses,int legs,int tongue,int eyes){
       super(brain,mouth,senses);

   }

    public void canTalk(){
        System.out.println("This is from dog");
        chew();
    }

    public void chew(){
        canEat();
        System.out.println("This is from dog chew");

    }

    public void canWalk(int speed ){
       super.canWalk(20);
       }

    @Override
    public void canRun(int speed) {
        System.out.println("Humans can run at a speed of "+ speed);
    }
}
