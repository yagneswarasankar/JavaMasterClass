package chapters.chapter4.ExpStatementMethods.AreaCalculator;

public class AreaCalculator {

    public static final int INVALID_VALUE_MESSAGE = -1;
    public static void main(String[] args) {


    }
    public static double area(double radius){
        if(radius < 0){
            return INVALID_VALUE_MESSAGE;
        }
       double PI = Math.PI;

        return PI * radius * radius;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return INVALID_VALUE_MESSAGE;
        }
        return x * y;
    }

}
