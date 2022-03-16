package chapters.chapter5.UserInput;
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year of Birth : ");
        if(sc.hasNextInt()) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            int age = 2022 - yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " and you are " + age + " years old");
               }
            else{
                System.out.println("Not a valid year ");
            }

        }else{
            System.out.println("Unable to parse the year ");
        }
        sc.close();
    }
}
