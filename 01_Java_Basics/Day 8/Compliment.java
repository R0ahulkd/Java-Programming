import java.util.Scanner;

public class Compliment {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        int b = ~a;
        System.out.println("Compliment of " + a + " is : " + b);
    }
}