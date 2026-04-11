import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate armstrong : ");
        int a = input.nextInt();
        double result = arm(a);
        int res = (int) result;
        if (res == a) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not a Armstrong number");
        }
    }
    public static double arm(int num) {
        int a = 0;
        int count = 0;
        int b = num;
        while (a < num) {
            num /= 10;
            count++;
        }
        num = b;
        double result = 0;
        double c;
        double dcount = count;
        while (a < num) {
            c = (num % 10);
            result += Math.pow(c,count);
            num = num / 10;
        }
        System.out.println(result);
        return result;
    }
}