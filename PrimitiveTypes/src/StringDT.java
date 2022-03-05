import java.sql.SQLOutput;

public class StringDT {

    public static void main(String[] args) {
        String myString = "This is a String";
        System.out.println("Initial string: "+ myString);

        myString = myString + " And appended to the String ";
        System.out.println("Now string is : "+ myString);

        myString = myString + "\u00A9 2018";
        System.out.println("with Unicode character the string is "+ myString);

        int myInt = 50;
        String strNumber = "30";
        strNumber = strNumber + myInt;
        System.out.println("The string literall 30 added to integer 50, the result is : " + strNumber);

        double myDouble = 50.453d;
        strNumber = strNumber + myDouble;
        System.out.println("The string literall 3050 added to double 50.453d, the result is : " + strNumber);

        //Lets see what if character added to a number

        char charD = 'D';
        byte b = 30;
        short s = 40;
        int myIntToAdd = 50;
        System.out.println(charD + myIntToAdd);
        System.out.println(charD + myDouble);
        System.out.println(charD + strNumber);
        System.out.println(charD + b);
        System.out.println(b + charD );
        System.out.println(charD + s);


    }
}
