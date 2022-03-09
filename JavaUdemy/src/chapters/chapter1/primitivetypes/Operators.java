package chapters.chapter1.primitivetypes;

public class Operators {

    public static void main(String[] args){

        int integer = 40;
        int result = integer + 40;
        System.out.println(" 40 + 40 = " + result); //80

        result = result -50;
        System.out.println("80 - 50 = " + result); //30

        result = result * 10;
        System.out.println("30 * 10 = " + result); //300

        result = result / 5;
        System.out.println("30 * 10 = " + result); // 60

        result = result % 9 ;
        System.out.println("60 % 7 = " + result);//6

        //Abbreviations

        result++; //Simple form of result = result + 1;
        System.out.println("6++ = " + result);//7

        result--;//Simple form of result = result - 1;
        System.out.println("7-- = " + result);//6

        result+=2; //Simple form of result = result + 2;
        System.out.println("6 - 2 = " + result);//8

        result*=10; //Simple form of result = result * 10;
        System.out.println("8 * 10 = " + result);//80

        result/=5; ////Simple form of result = result / 5;
        System.out.println("80 / 5 = " + result);//16

        result-=6; //Simple form of result = result - 6;
        System.out.println("16 - 6 = " + result);//10

        boolean isRupeeFalling = false;
        //Code Block
        if(isRupeeFalling == false) {
            System.out.println("No it is not!");
            System.out.println("I will be afraid!!");
        }

        //Logical operators
        //== , !=, > and >=, < and <=

        int examScore  = 100;
        if(examScore == 100)
            System.out.println("You got hight score ==");

        if(examScore != 100)
            System.out.println("You got hight score !=");

        if(examScore > 100)
            System.out.println("You got hight score >");

        if(examScore >= 100)
            System.out.println("You got hight score >=");

        if(examScore < 100)
            System.out.println("You got hight score <");

        if(examScore <= 100)
            System.out.println("You got hight score <=");

        int secondHighestScore = 80;
        if(secondHighestScore > 60 && secondHighestScore <= 100)
            System.out.println("Your score is more than 60 and less than 100");


        //Assignment operator vs Double equal to (==)

        int myValue = 50;
        if(myValue == 50) //myValue = 50 will throw an error.The reason being here the myvalue
            // is beingg assigned with value 50 and returning an Int and the if would require a boolean value
            //rather an integer. So using a == will acually evaluate the value and returns boolean.
            System.out.println("this is the value");

        boolean myCar = false;
        if(myCar = true){
            //This actually will output the println statement string. The reason being here mycar is assigned with
            //a true value and returns a true which the boolean would happyly accept. and print, But to
            //get the intended behavior we should actually be using the == operator again
            System.out.println("Although this gets printed it is not correct.");
        }

        // ******************
        // Becareful above the myCar value is set to True.

        myCar = false;
        if(myCar == true){
            //This will not output the value because the above test will evaluate to false as myCar = false.
            System.out.println("This will output");
        }
        //Consise
        myCar = false;
        if(!myCar){
            System.out.println("This is the proper and consise way to printing it");
        }

        //Ternary operator
        //If the condition is true first value else second value

        int carPrice = 30 > 40 ? 5000 : 6000;
        System.out.println(carPrice); //since 30 > 40 evaluates to false the second value is assigned.



    }
}
