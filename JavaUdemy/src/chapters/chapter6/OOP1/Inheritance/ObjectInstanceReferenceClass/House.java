package chapters.chapter6.OOP1.Inheritance.ObjectInstanceReferenceClass;

public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void getColor(){
        System.out.println("The house is with Color :"+color);
    }



}
