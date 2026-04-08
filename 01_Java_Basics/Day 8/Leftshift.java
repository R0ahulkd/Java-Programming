import java.util.Scanner;

public class Leftshift {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        int b = a << 3;
        System.out.println("Left Shift of " + a + " is : " + b);
    }
}