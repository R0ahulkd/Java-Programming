import java.util.Scanner;

public class Recursion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number you need to calculate Factorial : ");
        int num = input.nextInt();
        System.out.println(Factorial(num));
    }
    public static long Factorial(int num) {
        System.out.println("Function called for : " + num);
        if (num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}