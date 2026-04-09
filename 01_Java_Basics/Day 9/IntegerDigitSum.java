import java.util.Scanner;

public class IntegerDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Digit Sum : ");
        int num = input.nextInt();
        System.out.println(DigitSum(num));
    }
    public static int DigitSum(int a) {
        int sum = 0;
        while (a > 1) {
            int num = a%10;
            sum += num;
            a /= 10;
        }
        return (sum);
    }
}