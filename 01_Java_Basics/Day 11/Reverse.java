import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse : ");
        int number = input.nextInt();
        System.out.println(reverse(number));
    }
    public static int reverse(int num) {
        int result = 0;
        int a = 0;
        int b = 0;
        while (a < num) {
            result *= 10;
            b = num % 10;
            result += b;
            num /= 10;
        }
        return result;
    }
}