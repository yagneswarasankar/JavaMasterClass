package chapters.chapter7.ArrayLists.MobilePhoneChallenge;

import java.util.ArrayList;

public class MobilePhone {

    static ArrayList<Contacts> contacts = new ArrayList<Contacts>();


    public void store(Contacts contact){
        contacts.add(new Contacts(contact.name,contact.number));

    }

    public void printContacts(){
        for (Contacts contact : contacts) {
            System.out.println(contact.name + " " + contact.number);
        }
       /* for(int i = 0; i< contacts.size(); i++){
            System.out.println(contacts.get(i).name +" "+contacts.get(i).number);
        }*/
    }




    public boolean contains(String name1){
        boolean isExists = false;
        for(int i = 0;i< contacts.size();i++){
            if(contacts.get(i).name == name1){
                isExists = true;
                break;
            }

        }
        return isExists;
    }




}

