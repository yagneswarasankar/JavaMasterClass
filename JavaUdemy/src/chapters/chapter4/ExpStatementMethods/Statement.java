package chapters.chapter4.ExpStatementMethods;

public class Statement {
    public static void main(String[] args){
        boolean gameOver = true;
        int bonus = 500;
        int levelsCompleted = 5;

        int myScore = 800;
        if( myScore < 5000 &&  myScore > 1000 ){
            System.out.println("The score is less than 5000 and more than 1000");
        }else if(myScore < 1000){
            System.out.println("Your score is lessthan 1000");
        }else {
            System.out.println("You got here");
        }

        //Scope :
        //The variables defined in a code block can not be accessed out side the code block but the reverse is not
        //correct. as we can access the variables defined outside the block can be accessed within the code block
        if(gameOver){
            int finalScore  = myScore + (bonus * levelsCompleted);
            System.out.println("Final score is "+ finalScore);
        }
        int myScore2 = 10000;
        int levelsCompleted2 = 8;
        int bonus2 = 200;

        if(gameOver){
            int finalScore  = myScore2 + (bonus2 * levelsCompleted2);
            System.out.println("Final score is "+ finalScore);
        }

        //An efficient way to create the above program without creating the variables. But it is not possible
        //to persist the values as they were redefined
        // Disadvantage is that the code is duplicated.

        myScore = 10000;
        levelsCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore  = myScore + (bonus * levelsCompleted);
            System.out.println("Final score is "+ finalScore);
        }


    }
}
