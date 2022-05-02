package chapters.chapter10.Generics.GenericsDemo;

public class GenericsDemo<T> {
    T obj;
    GenericsDemo(T obj) {
        this.obj = obj;
    }
    public T getValue() {
        return obj;
    }
}
class Main{
    public static void main(String[] args) {

        GenericsDemo<Integer> iObj = new GenericsDemo<>(15);
        GenericsDemo<String> sObj = new GenericsDemo<>("Girija");

        System.out.println(iObj.getValue());
        System.out.println(sObj.getValue());
    }

}
