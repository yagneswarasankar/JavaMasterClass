package chapters.chapter9.Interfaces.Telephone;

public class DeskPhone implements ITelephone {



    private int myNumber;
    private boolean isRinging = true;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken . For Deskphone there is no power.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing the phone number "+ phoneNumber);
    }

    @Override
    public void answer() {
     if(isRinging){
         System.out.println("Answering the deskPhone");
         isRinging = false;
     }
    }

    @Override
    public boolean callPhonoe(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
