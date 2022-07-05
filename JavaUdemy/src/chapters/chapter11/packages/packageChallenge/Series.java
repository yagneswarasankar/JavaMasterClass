package chapters.chapter11.packages.packageChallenge;

public class Series {

    public static long nSum(int n){

        return (n *(n + 1))/2;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;

            }
        }
        return c;
    }

}
