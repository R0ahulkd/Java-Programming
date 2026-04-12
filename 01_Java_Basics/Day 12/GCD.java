import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        System.out.println("GCD of " + a + " and " + b + " = " + HCF(a,b));
    }
    public static int HCF(int first,int second) {
        int greatest = 0;
        if (first >= second) {
            greatest = first;
        } else {
            greatest = second;
        }
        int i = greatest;
        while (i > 0) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
            i -= 1;
        }
        return 1;
    }
}