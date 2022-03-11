package chapters.chapter4.ExpStatementMethods.TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int myFirst, int mySecond, int myThird){
       return isTeen(myFirst) || isTeen(mySecond) || isTeen(myThird);
    }
    public static boolean isTeen(int num){
        return num >= 13 && num <= 19;
    }
}
