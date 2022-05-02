package chapters.chapter7.ArrayLists.GroceryList;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    private void modifyGroceryList(int position, String item) {
        groceryList.set(position, item);
    }

    public void modifyGroceryList(String item){
        int position  = findGroceryItem(item);
        if(position >= 0){
            modifyGroceryList(position,item);
        }
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " elements in your groceryList");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ". " + groceryList.get(i));
        }
    }

    public boolean removeElement(String item) {
        boolean found= false;
        int position = findGroceryItem(item);
        if(position >= 0) {
            System.out.println("removed Ited: " + item);
            groceryList.remove(position - 1);
            found = true;
        }
        return found;


    }

    private int findGroceryItem(String item) {
        return groceryList.indexOf(item);
    }

}



