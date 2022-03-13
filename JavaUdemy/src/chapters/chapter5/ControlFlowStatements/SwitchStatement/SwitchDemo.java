package chapters.chapter5.ControlFlowStatements.SwitchStatement;

public class SwitchDemo {

    public static void main(String[] args){
        int number = 6;

        switch(number){
            case 1:
                System.out.println("The number is one ");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3: case 4: case 5:
                System.out.println("The number is either 3,4,5");
                System.out.println("The actual number is : "+ number);
                break;
            default:
                System.out.println("The number is neither of 1,2,3,4 or 5");
        }

        char literal = 'E';
        switch(literal){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The letter is "+ literal);
                break;

            /*case 'A':
                System.out.println("The letter is A");
                break;
            case 'B':
                System.out.println("The letter is B");
                break;
            case 'C':
                System.out.println("The letter is C");
                break;
            case 'D':
                System.out.println("The letter is D");
                break;
            case 'E':
                System.out.println("The letter is E");
                break;*/
            default:
                System.out.println("Not found");

        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not found");
        }

        int sum = 6;
        switch(sum){
            case 2 :
                System.out.println(sum(3,4));
                break;
            case 3:
                System.out.println(sum(5,4,6));
                break;
            default:
                System.out.println("the parameters did not match");
        }

    }

    public static int sum(int a , int b){
        return a + b;
    }
    public static int sum(int a , int b, int c){
        return a + b + c;
    }
}
