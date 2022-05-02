package  chapters.chapter9.Interfaces.Telephone;

public class Main {
    public static void main(String[] args) {
        ITelephone girijasPhone ;
        girijasPhone = new DeskPhone(12345);
        girijasPhone.powerOn();
        girijasPhone.dial(12345);
        girijasPhone.answer();

        girijasPhone= new MobilePhone(23456);
        girijasPhone.powerOn();
        girijasPhone.callPhonoe(23456);
        girijasPhone.answer();


    }


}
