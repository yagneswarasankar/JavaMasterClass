package chapters.chapter9.Interfaces.Telephone;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhonoe(int phoneNumber);
    boolean isRinging();

}
