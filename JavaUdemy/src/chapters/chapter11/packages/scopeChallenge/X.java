package chapters.chapter11.packages.scopeChallenge;

import java.util.Scanner;

public class X {

    int x ;

    public X(Scanner x) {
        System.out.println("Enter the number");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x = 1; x <= 12;x++){
            System.out.println(x + " times " + this.x +" is "+ x * this.x);
        }
    }
}
