package chapters.chapter4.ExpStatementMethods;

public class KeywordsAndExpression {
    public static void main(String[] args){

        //There are 53 keywords in Java. All of them will be highlighted using the blue color in IDEs.
        //Expressions:
        //Expressions are part of the the statements, excluding the datatypes and the semicolons.
        //They are build with variables values and the operators and part of Method calls

        double kilometers = ( 100 * 1.609344);// In this we have kilometers = ( 100 * 1.609344) is expression
        int highScore = 50; //here highScore = 50 is the expression
        if (highScore == 50) //the expression inside the if statement
        {
            System.out.println("You got the highest score."); // in this "You got the highest score." is expression.
        }

        //Few more examples
        int score = 100; //score = 100
        if(score > 90){ //score == 90
            System.out.println("you got the hight score"); //"you got the hight score"
            score = 0; //score = 0
        }

        //Steatements
        //The statement can be the entire line in the part of the code. Expressions are part of statements.
        //Examples
        int myScore = 50;// This entire line makes a statement.
        myScore++;
        myScore--;
        System.out.println("This will print the entire line");//Again these also make statements.




    }
}
