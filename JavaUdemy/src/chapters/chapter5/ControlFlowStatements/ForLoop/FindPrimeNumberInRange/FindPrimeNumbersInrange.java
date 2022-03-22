package chapters.chapter5.ControlFlowStatements.ForLoop.FindPrimeNumberInRange;

public class FindPrimeNumbersInrange {

    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(20));

        int numOfPrimes = 0;
        for(int i = 20;i <= 50; i ++){
            if(isPrime(i)){
                System.out.println("The number "+i+" is prime");
                numOfPrimes += 1;
                if(numOfPrimes >= 3)
                    break;
            }
        }

    }
    private static boolean isPrime(int num){
        if( num ==1){
            return false;
        }else{
            for(int i = 2; i<= (long)Math.sqrt(num); i++){
                if(num % i ==0)
                    return false;
            }

        }
        return true;
    }
}
