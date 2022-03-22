package chapters.chapter1.primitivetypes;

public class PrimitiveTypeChallenge {

    public static void main(String[] args){

        double myDouble1 = 20;
        double myDouble2 = 80;
        double myResult3 = (myDouble1 + myDouble2) * 100;
        double myReminder = myResult3 % 40;
        boolean isReminder4 = (myReminder == 0) ? true : false;
        System.out.println("Is the output reminder is 0 ?: " +isReminder4);

        if(!isReminder4){
            System.out.println("Got some reminder");
        }


    }


}