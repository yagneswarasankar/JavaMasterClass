package chapters.chapter6.OOP1.Inheritance.ObjectInstanceReferenceClass;

public class Main {

    public static void main(String[] args) {
        //House : Class
        //h : Instance or Object of House
        //gh refernce
        House h = new House("grean"); // Object or instance of House
        h.getColor();
        House gh = h; //gh is a reference
        gh.setColor("red");
        h.getColor();
        gh.getColor();
        House yh = new House("yellow");
        gh = yh;
        h.getColor();
        gh.getColor();
        yh.getColor();

    }
}
