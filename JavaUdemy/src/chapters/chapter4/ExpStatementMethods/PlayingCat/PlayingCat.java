package chapters.chapter4.ExpStatementMethods.PlayingCat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temperature){

        if(summer && temperature >= 25 && temperature < 45){
            return true;
        }
        else if(summer || (temperature >= 25 && temperature <= 35) )
            return true;
        else return false;
    }

    public static boolean isCatPlaying1(boolean summer, int temperature) {
            int upperLimit = summer ? 45 : 35;
            return temperature >= 25 && temperature <= upperLimit;
        }

}
