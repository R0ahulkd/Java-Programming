import java.util.Scanner;

public class Ifelse {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible");
        }
        else {
            System.out.println("You are not Eligible.");
        }
    }
}