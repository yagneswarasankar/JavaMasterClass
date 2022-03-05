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

        //Like how whole numbers will be treated by default as Integer , the floating point  by default
        //will be treated as a Double

        int intValue = 5 / 3;
        float floatValue = (float)5.25; //float floatValue = 5.25; will throws an error and float floatValue = 5.25f; float floatValue = (float)5.25;  way to cast
        double doubleValue = 5.45d; //double doubleValue = 5.45; will not throw error but it is recommended to have "d" for readability.

        //Division examples using floating point number.
        int intValue1 = 5 / 2;    //The value of intValue1: 2
        float floatValue1 = 5f / 2f; //The value of floatValue1: 2.5
        double doubleValue1 = 5d / 2d; //The value of doubleValue1: 2.5

        System.out.println("The value of intValue1: " + intValue1);
        System.out.println("The value of floatValue1: " + floatValue1);
        System.out.println("The value of doubleValue1: " + doubleValue1);

        int intValue2 = 5 / 2;    //The value of intValue1: 2
        float floatValue2 = 5f / 3f; //The value of floatValue2: 1.6666666 - 7 values after the decimal
        double doubleValue2 = 5.00 / 3.00; //The value of doubleValue2: 1.6666666666666667 - 16 values after the decimal double doubleValue2 = 5d / 3d;

        System.out.println("The value of intValue2: " + intValue2);
        System.out.println("The value of floatValue2: " + floatValue2);
        System.out.println("The value of doubleValue2: " + doubleValue2);

        /*
         * It is recommended to use Double than the Float although it occupy double the amount of the space.
         * 1. Most of the modern computers at the chip level processes the double numbers faster
         * 2. Most of the java libraries will uses math functions that processes doubles not floats and returns results as Double.
         *    It is obvious as it is more precise (more precision numbres after the decimal)
         * 3. Java treats default floating point number as double but not float.
         */

        //CHALLENGE:
        /*
         * Convert given number of pounds to Kilograms
         * 1. Create a varible to hold the number pounds to be converted to kilograms
         * 2. Calculate the result and create a variable with appropriate type to store the value.
         * 1 Pound = 0.45359237 kilos.
         */

        double pounds = 5.6;
        double kilos = pounds * 0.45359237d;
        System.out.println(pounds +" equals to " + kilos);

        //It is generally a good practice to use BigDecimal to use for floating poing cacluations where currency precision has to be very acurate.
        //The reason for this is the way the floating point numbers are stored not the java problem as such.
















    }



}
