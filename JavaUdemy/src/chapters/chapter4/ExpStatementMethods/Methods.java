package chapters.chapter4.ExpStatementMethods;

public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int bonus = 500;
        int levelsCompleted = 5;
        int myScore = 800;

        int returnedFinalScore = calculateScore(gameOver,bonus,levelsCompleted,myScore);
        System.out.println("The final score returned from Method is : "+ returnedFinalScore);

        bonus = 200;
        levelsCompleted = 8;
        myScore = 10000;

        returnedFinalScore = calculateScore(gameOver,bonus,levelsCompleted,myScore);
        System.out.println("The final score returned from Method is : "+ returnedFinalScore);

    }

    public static int calculateScore(boolean gameOver,int bonus, int levelsCompleted, int myScore){
        //Scope :
        //The variables defined in a code block can not be accessed out side the code block but the reverse is not
        //correct. as we can access the variables defined outside the block can be accessed within the code block
        if (gameOver) {
            int finalScore = myScore + (bonus * levelsCompleted) ;
            return finalScore;
        }
        return -1;

    }
}
