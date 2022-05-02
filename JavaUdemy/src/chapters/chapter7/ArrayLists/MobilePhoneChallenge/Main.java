package chapters.chapter7.ArrayLists.MobilePhoneChallenge;

public class Main {

    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();

        mp.store(new Contacts("Girija",98432));
        mp.store(new Contacts("Hari",98435));
        mp.printContacts();
        System.out.println(mp.contains("Girija"));
    }
}
