public class FloatDouble {

    public static void main(String[] args){

        /*
        Float is a single precision valued number. It requires 4 bytes to store a Float number.
        Double is a double precision valued number. It required 8 bytes to store a Double number.
         */
        //Float
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("The Min Float value is : " + floatMinValue); //The Min Float value is : 1.4E-45
        System.out.println("The Max Float value is : " + floatMaxValue); //The Max Float value is : 3.4028235E38
        
        //Double
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("The Min Double value is : " + doubleMinValue);//The Min Double value is : 4.9E-324
        System.out.println("The Max Double value is : " + doubleMaxValue);//The Max Double value is : 1.7976931348623157E308

        //Like how whole numbers will be treated by default as Integer , the floating poiting number by default
        //will be treated as a Double

        int intValue = 5;
        float floatValue = (float)5.25; //float floatValue = 5.25; will throws an error
        double doubleValue = 5.45;



    }



}
