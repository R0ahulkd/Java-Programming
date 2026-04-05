import java.util.Scanner;

public class positivenegative {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number < 0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is equal to 0");
        }
    }
}