package chapters.chapter4.ExpStatementMethods.DecimalComparator;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirst
            ,double mySecond){
        return (int)(myFirst * 1000) == (int)(mySecond * 1000);
    }



}
