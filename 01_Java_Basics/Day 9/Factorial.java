import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check factorial : ");
        int num = input.nextInt();
        System.out.println(Factorial(num));
    }
    public static int Factorial(int a) {
        int i = 1;
        int mul = 1;
        while (a >= 1) {
            mul *= a;
            a -= 1;
        }
        return mul;
    }
}