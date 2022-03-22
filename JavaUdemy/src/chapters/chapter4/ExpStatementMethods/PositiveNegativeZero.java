package chapters.chapter4.ExpStatementMethods;

public class PositiveNegativeZero {

    public static void main(String[] args){
        System.out.println(checkNumber(5));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(-1));

    }
    public static String checkNumber(int num){
        String res = "zero";
        if(num > 0){
            res = "positive";
        }else if(num < 0){
            res = "negative";
        }
        return res;

    }

}
