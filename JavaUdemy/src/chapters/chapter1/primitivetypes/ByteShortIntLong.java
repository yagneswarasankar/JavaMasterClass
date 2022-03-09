package chapters.chapter1.primitivetypes;

public class ByteShortIntLong {

        public static void main(String[] args) {

            //Here Integer is a wrapper class and int is a primitive datatype. Wrapper class allows us to convert an
            //object to a primitive type and the primitive type in to an objecgt.
            int integerMinValue = Integer.MIN_VALUE;
            int integerMaxValue = Integer.MAX_VALUE;

            System.out.println("Min value of Integer type is :" + integerMinValue); //Min value of Integer is :-2147483648
            System.out.println("Max Value of Integer type is :" + integerMaxValue); //Max Value of Integer is :21474836471

            //If the value is great than the max value that type can hold it is Overflow
            //if the value is less than the min value that type can hold it is Underflow
            System.out.println("The busted Min Value : " + (integerMinValue -1)); //Under flow. The busted Min Value : 2147483647
            System.out.println("The busted Max Value : " + (integerMaxValue +1)); //Over flow.  The busted Max Value : -2147483648

            //Under score representaion of numbers works fine from Java 7 and above.
            int myLiteralInteger = 2_147_483_647;
            System.out.println("The value of Underscored number :" + myLiteralInteger); //2147483647

            //Byte Type : Same Underflow and overflow appllies to all datatypes.

            byte byteMinValue = Byte.MIN_VALUE;
            byte byteMaxValue = Byte.MAX_VALUE;
            System.out.println("Min value of Byte type : " + byteMinValue); //Min value of Byte type : -128
            System.out.println("Max value of Byte type : " + byteMaxValue); //Max value of Byte type : 127

            //Short Type

            short  shortMinValue = Short.MIN_VALUE;
            short  shortMaxValue = Short.MAX_VALUE;
            System.out.println("Min value of Short type : " + shortMinValue); //Min value of Short type : -32768
            System.out.println("Max value of Short type : " + shortMaxValue); //Max value of Short type : 32767

            //Long Type

            long  longMinValue = Long.MIN_VALUE;
            long  longMaxValue = Long.MAX_VALUE;
            System.out.println("Min value of Long type : " + longMinValue); //Min value of Long type : -9223372036854775808
            System.out.println("Max value of Long type : " + longMaxValue); //Max value of Long type : 9223372036854775807

       /*By Default if the arithmetic operations are used with datatypes other than integers it will throw an error.
         By default Java treats the result of any arithmetic operation as integer and when it finds the result
         of an operation is other than an integer it will throw an error.This will raise a need to "CAST"ing.
        */

            byte newByteValue   = (byte) (byteMinValue / 2); // byte newByteValue = (byteMinValue / 2); will result an error stating required is byte provided int.
            short newShortValue = (short) (shortMinValue / 2); // as as above.short newShortValue = (shortMinValue / 2); will throw error
            int newIntgerValue = (integerMinValue / 2); //No error.
            long newLongValue  = (longMinValue  /2 ); // No error as the result of (longMinValue  /2 ) as a whole can fit into the variable.


        /*
        step1. Create a Byte , Short, Integer type variables with respective allowed values to them
        Create a long Variable set to 50000 plut 10 times the sum which is the result of step 1.

         */
            byte byteVariable = 20;
            short shortVariable = 4300;
            int intVariable = 32000;

            long longVariable = 50000L;

            long result = longVariable + 10L * (byteVariable + shortVariable + intVariable);

            System.out.println("The results is :" + result);


        }
    }


