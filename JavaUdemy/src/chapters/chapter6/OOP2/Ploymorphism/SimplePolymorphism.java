package chapters.chapter6.OOP2.Ploymorphism;

import chapters.chapter6.OOP1.Rectancle.Rectangle;

public class SimplePolymorphism {

    public static void main(String[] args) {
        rectangle rectangle = new rectangle();
        rectangle.render();

        octogan octogan = new octogan();
        octogan.render();
    }
}
class polygon{
    private String name;
    public polygon(String name) {
        this.name = name;

    }
    public void render(){
        System.out.println("rendering from polygon");
    }
}

class rectangle extends polygon{
    public rectangle() {
        super("Rectangle");
    }


    public void render() {
        System.out.println("rendering from rectagle");
    }
}

class circle extends polygon{
    public circle() {
        super("circle");
    }


    public void render() {
        System.out.println("rendering from circle");
    }
}

class octogan extends polygon{
    public octogan() {
        super("octogan");
    }

    // no rendering method
}
