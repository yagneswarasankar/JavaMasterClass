package chapters.chapter5.ControlFlowStatements.LastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int myFirstNumber,
                                           int mySecondNumer,
                                           int myThirdNumber){
        if(!(isValid(myFirstNumber) && isValid(mySecondNumer) && isValid(myThirdNumber)))
            return false;

        return((myFirstNumber % 10 == mySecondNumer % 10)
                || (myThirdNumber % 10 == mySecondNumer % 10) || (myFirstNumber % 10 == myThirdNumber % 10));

    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

}
