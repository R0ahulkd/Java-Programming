import java.util.Scanner;

public class BitwiseOR {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = input.nextInt();
        System.out.print("Enter second number : ");
        int second = input.nextInt();
        int result = first | second;
        System.out.println(first + " OR " + second + " = " + result);
    }
}