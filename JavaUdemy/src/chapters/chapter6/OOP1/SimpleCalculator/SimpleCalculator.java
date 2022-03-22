package chapters.chapter6.OOP1.SimpleCalculator;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //get methods

    public double getFirstNumber(){
        return this.firstNumber; // Here this is not needed as it is a private variable and is available to access
        //from class methods. and there is not ambiguity in the name.
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    //set methods
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        //Here although the class variable secondNumber can be set with the parameter since there is an ambiguity we are using the "this." operator.
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }

}
