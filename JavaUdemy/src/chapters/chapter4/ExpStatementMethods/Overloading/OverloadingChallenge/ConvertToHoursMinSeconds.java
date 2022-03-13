package chapters.chapter4.ExpStatementMethods.Overloading.OverloadingChallenge;

import java.sql.SQLOutput;

public class ConvertToHoursMinSeconds {
    private static final String INVALID_VALUE_MESSAGEG = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDuration(65, 45));
        System.out.println(getDuration(13261L));
        System.out.println(getDuration(-5,65));
        System.out.println(getDuration(-34));
        System.out.println(getDuration(65,9));
    }

    public static String getDuration(long minutes, long seconds) {
        if (minutes < 0 && (seconds < 0 || seconds >= 59)) {
            return INVALID_VALUE_MESSAGEG;
        }


        int hours = (int) minutes / 60;
        int newMin = (int) minutes % 60;
        String hourString = hours + "h ";
        String minutesString = newMin + "m ";
        String secondString = seconds +"s ";
        if(hours < 10)
        {
            hourString = "0" + hours ;
        }
        if(minutes < 10)
        {
            minutesString = "0" + newMin;
        }
        if(seconds < 10)
        {
            secondString = "0" + seconds ;
        }

        return minutes + " minutes " + seconds + " seconds = " + hourString + "h " + minutesString + "m " + secondString + " s";

    }

    public static String getDuration(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGEG;
        }
        int newMin = (int) (seconds / 60);
        int newSeconds = (int) (seconds % 60);
        return getDuration(newMin, newSeconds);
    }
}





