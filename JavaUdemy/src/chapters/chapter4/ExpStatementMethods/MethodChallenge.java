package chapters.chapter4.ExpStatementMethods;

public class MethodChallenge {

    public static void main(String[] args){
        System.out.println("print score");

        String name = "Girija";
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Phani",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mani",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Hari",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Girija",position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Pallavi",position);


    }
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name + " managed to get into postion  "
                + position +" on the high score table");
    }
    public static int calculateHighScorePosition(int score){
     /*   if(score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        else return 4;*/
        int position = 4;
        if(score >= 1000){
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100); {
            position = 3;
        }
        return position;
    }
}
