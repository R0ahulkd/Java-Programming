import java.util.Scanner;

public class mintwoTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        int min = a > b ? b : a;
        System.out.println("Smallest Number between " + a + " and " + b + " is " + min);
    }
}