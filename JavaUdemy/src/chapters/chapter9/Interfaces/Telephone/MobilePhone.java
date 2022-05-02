package chapters.chapter9.Interfaces.Telephone;

public class MobilePhone implements ITelephone {


    private boolean isOn=false;
    private int myNumber;
    private boolean isRinging = true;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
            isOn = true;
            System.out.println("The mobile phone is on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now dialing the phone number " + phoneNumber);
        }
        else{
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobilePhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhonoe(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("MelodyRing");
            isRinging = true;
        }else{
            System.out.println("The phone is switched off or different number");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
