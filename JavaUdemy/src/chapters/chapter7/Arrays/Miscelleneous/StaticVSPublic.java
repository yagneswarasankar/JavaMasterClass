package chapters.chapter7.Arrays.Miscelleneous;

import chapters.chapter6.OOP1.StaticInstanceMethods.StaticInstanceMethodDemo;

import java.util.Scanner;

public class StaticVSPublic {

    static int number ;
    static Scanner scanner = new Scanner(System.in);

    public StaticVSPublic(int a) {
        number = a;
    }

    /*public StaticVSPublic(int a) {
            number = a;
        }*/
    public int getNum(){
        return number;

    }
    public int[] getNumbers(int count){
        int[] number = new int[count];
        for(int i=0;i<count;i++){
            number[i] = scanner.nextInt();
        }
        return number;
    }


    public static void main(String[] args){
        int a =  scanner.nextInt();
        System.out.println(a);
        StaticVSPublic svp = new StaticVSPublic(43);
        StaticVSPublic svp1 = new StaticVSPublic(54);
        System.out.println(svp.getNum());
        System.out.println(svp1.getNum());

    }

}
