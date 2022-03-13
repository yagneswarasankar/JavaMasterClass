package chapters.chapter4.ExpStatementMethods.Overloading.OverloadingChallenge;

public class ConvertToCentimeters {
    public static void main(String[] args){

        calcFeetAndInchesToCentimeters(5,4);
        calcFeetAndInchesToCentimeters(64);
        calcFeetAndInchesToCentimeters(8);
        calcFeetAndInchesToCentimeters(-5,8);
        calcFeetAndInchesToCentimeters(5, 13);
        calcFeetAndInchesToCentimeters(-8);
        calcFeetAndInchesToCentimeters(13);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,
                                                        double inches){
        boolean validParameters = feet >= 0 && (inches >= 0 && inches <= 12 );
        double result = -1;
        if(validParameters){
            result = (double)((feet * 12) * 2.54 + inches * 2.54);
            System.out.println(feet +" feet " +inches + " inches = "+result +" cm");
        }
        else System.out.println("Feet = "+ feet + " inches =" + inches +" Invalid parameters.");
        return result;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){

        int newInches = (int)inches % 12;
        if(newInches >= 0) {
            if (inches > 12) {
                int feet = (int) inches / 12;
                System.out.println(inches + " inches ="+feet + " feet " + newInches +" inches");
                return calcFeetAndInchesToCentimeters(feet, newInches);
            }
            else return inches * 2.54;
        }
        return -1;


    }
}
