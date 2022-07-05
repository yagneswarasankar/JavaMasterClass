package chapters.Miscelleneous.WaysToDeclare;

public class CharForloop {

    public static void main(String[] args) {

        int lastRows = 'A'+11;
        for(int row = 'A';row< lastRows;row++){
            for(int seatNum = 1;
                seatNum < 12; seatNum++){
                System.out.print((char)(row) + String.format("%02d",seatNum)+ " ");
            }
            System.out.println("");
        }



    }
}
