import java.util.Scanner;

public class question1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is : " + c);
    }
}