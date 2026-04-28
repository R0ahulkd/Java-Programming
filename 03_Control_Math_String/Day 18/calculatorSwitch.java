import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        System.out.println("Enter 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division");
        int c = input.nextInt();

        int num = switch (c) {
            case 1 -> a+b;
            case 2 -> a-b;
            case 3 -> a*b;
            case 4 -> a/b;
            default -> 0;
        };
        System.out.println(num);
    }
}