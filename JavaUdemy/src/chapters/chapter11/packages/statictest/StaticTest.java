package chapters.chapter11.packages.statictest;

public class StaticTest {

    private String name;
    private static int numOfInstances;

    public StaticTest(String name) {
        this.name = name;
        numOfInstances++;
    }

    public static int getNumOfInstances() {
        return numOfInstances;
    }

    public String getName() {
        return name;
    }
}
