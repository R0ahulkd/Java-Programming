import java.util.Scanner;

public class Rightshift {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        int b = a >> 1;
        System.out.println("Left Shift of " + a + " is : " + b);
    }
}