import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is palindrome or not : ");
        int number = input.nextInt();
        result(number);
    }
    public static void result(int num) {
        int a = num;
        int n = 0;
        int p = 0;
        while (num > 0) {
            p *= 10;
            n = num % 10;
            num = num / 10;
            p += n;
        }
        if (p == a) {
            System.out.println("Yes Palindrome Number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}