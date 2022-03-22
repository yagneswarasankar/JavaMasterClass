package chapters.chapter6.OOP1.StaticInstanceMethods;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                StaticInstanceMethodDemo.staticMethod(4,5));

        StaticInstanceMethodDemo sid = new StaticInstanceMethodDemo();
        System.out.println(sid.printStaticMethodResults(5,6));
        System.out.println(StaticInstanceMethodDemo.a);

    }
}
