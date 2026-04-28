import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = input.nextInt();
        boolean min = (a%2 == 0) ? true : false;
        if (min) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}