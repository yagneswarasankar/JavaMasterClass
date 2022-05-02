package chapters.chapter5.ControlFlowStatements.AnyOfLoops.Denominations;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Denominations {

    private static int fiveCoins;
    private static int twoCoins;
    private static int oneCoints;

    private static int[] coinArray = new int[3];
    private static int[] denominationsArray = new int[3];;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the dinomination: ");
        int number  = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i< 3; i++) {
            System.out.print("Enter "+ (i+1)+ " denomination: ");
            denominationsArray[i] = sc.nextInt();
            sc.nextLine();
        }

    for(int i = 0;i < coinArray.length ; i++){
        System.out.print("Enter number of "+denominationsArray[i]+" coins: ");
        coinArray[i]= sc.nextInt();
        sc.nextLine();
    }

        denominations(number);

    }


    private static void denominations(int num){
        int[] resultFirstDenominator = new int[3];


        System.out.println("Available denominations ");
        for (int i = 0;i< coinArray.length;i++) {
            System.out.println("Number of available " + denominationsArray[i] + " conins are " + coinArray[i]);
        }

        while(num > 0) {
            for (int i = 0; i < coinArray.length; i++) {
                resultFirstDenominator[i] = (num > (denominationsArray[i] * coinArray[i])) ? coinArray[i]: (num / denominationsArray[i]);
                num = num - (resultFirstDenominator[i] * denominationsArray[i]);
                if(num <= 0 || i == coinArray.length )
                    break;
            }
            break;

        }
        if(num > 0){
            System.out.println("The denomination can not be formed.");
        }
        else {

            for (int i = 0; i < resultFirstDenominator.length; i++) {
                System.out.println(resultFirstDenominator[i]);
            }
        }

    }

    /*private static String canDenominationFormed(int num){
        String result
                ="Available Denominations : " +
                "\n fiveCoiins :" + fiveCoins +
                "\n twoCoins :" + twoCoins +
                "\n oneCoins :"+ oneCoints;

        int resultFiveCoins = 0;
        int resultTwoCoins = 0;
        int resultOneCoins = 0;

        //int bigCountToUse = fiveCoins < num/5 ? fiveCoins : num/5 ; // #2 determine how many bigCount to use

        resultFiveCoins = Math.min(fiveCoins, num / 5);
         int remainingNumber = num - (5 * resultFiveCoins);
         if(remainingNumber > 0)
         {
             resultTwoCoins  = Math.min(twoCoins, remainingNumber / 2);
             remainingNumber = remainingNumber - (2 * resultTwoCoins);
         }
        if(remainingNumber > 0)
        {
            resultOneCoins  = remainingNumber < oneCoints ? remainingNumber : -1;

        }
        if(resultOneCoins == -1){
            result = "\n " + result+ "\n" +"Denomination can not be formed";
        }
        else result = "\n "+ result +"\n" + resultFiveCoins +" "+ resultTwoCoins + " "+ resultOneCoins;
        return result;
    }*/



}
