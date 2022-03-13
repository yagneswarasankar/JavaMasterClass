package chapters.chapter4.ExpStatementMethods.MinutesToYearCalculation;

public class MinutesToYearsDaysCalculator {

    public static final String INVALID_ERROR_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_ERROR_MESSAGE);
        }
        else {

            long years = (int) (minutes / 60 / 24 / 365);
            long days = (int) ((minutes) % (365 * 60 * 24)) / (24 * 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
