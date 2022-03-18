package chapters.chapter6.OOP1.StaticInstanceMethods;

public class StaticInstanceMethodDemo {

    static int a = 432;
    static int b = 328;
    public static int staticMethod(int c,int d){
        return c * c;
    }

    public int printStaticMethodResults(int a, int b){
        return staticMethod(a,b);
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }

}
