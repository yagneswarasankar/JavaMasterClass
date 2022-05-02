package chapters.chapter6.OOP1.OOPSamples.Humans;

public class Humans {

    int numberOfLegs;
    int numberOfEyes;
    boolean isEating = false;

    public boolean isEating(){
        if(this.isEating){
            System.out.println("This member is eating");
            isEating = true;
        }
        return isEating;
    }




   }
