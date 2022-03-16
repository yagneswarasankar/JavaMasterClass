package chapters.chapter5.ControlFlowStatements.AnyOfLoops.LargestPrimeNumber;

public class LargestPrime {
    public static int getLargestPrime(int number) {

       if (number <= 1) {
            number = -1;
        }
        for (int i = 2; i <= number/2 ;i++) {
            if (number % i == 0) {
                number = getLargestPrime(number/i);
            }
        }
        return number;
    }

}
 /*public class LargestPrime {

     public static int getLargestPrime(int number){
         if(number < 2) return -1;
         // anything less than 2 is not a prime

         int largePrime = 0;
         // initialize largestPrime to zero

         for(int i=2; i<=Math.sqrt(number); i++){
             // loop from 2 to squareroot of number for effeciency

             while(number % i ==0){
                 // check if the given number is
                 //    divisible by every number
                 number /= i;        // if so divide the number
                 largePrime = i;     // assign the divider to the largest
             }                       // continue unitll outer loop breaks
         }

         // if the number is not completely divisible then check if the remainder ie; number  is greater than
         // the largestPrime
         // return the largestPrime
         return number > largePrime? number : largePrime;

     }
 }*/
/*public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number<2) return -1;
        for (int i=number/2; i>1; i--) {
            if(number%i==0) number=i;
        }
        return number;
    }
}*/
