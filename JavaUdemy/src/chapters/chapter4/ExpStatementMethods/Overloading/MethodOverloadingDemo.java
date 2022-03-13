package chapters.chapter4.ExpStatementMethods.Overloading;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        int newScore = calculateScore("Girija",10);
        System.out.println("The score of the person is : "+ newScore);

        int scoreNew = calculateScore(75);
        System.out.println("The new score is "+ scoreNew);

        //Even if the procedure(void type of method) is differing in parameters
        //it will be fine to overload the method.
        getName("Girija",50);
        getName(300);

        //In case of a function you can not just changeg the return type
        //to overload the method. It is mandatory change either the number
        //of parameters or the type of the parameters.
        //For ex : public static void calculateScore(int score) is not valid
    }
    public static int calculateScore(String name, int score){
        System.out.println("The pereson "+ name +" scored " + score + " points");
        return score * 10;
    }
    public static int calculateScore(int score){
        System.out.println("The unnamed person had scored "+ score);
        return score * 100;
    }

    public static void getName(String name,int sc){
        System.out.println("The name  is :"+name + " score is :"+ sc);
    }
    public static void getName(int sc){
        System.out.println("the Unnamed person scored "+ sc);

    }
}
