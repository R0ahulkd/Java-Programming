import java.util.Scanner;

public class Swap{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Values After Swapping");
        System.out.println("First Number is : " + a);
        System.out.println("Second Number is : " + b);
    }
}