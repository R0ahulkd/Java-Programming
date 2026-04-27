import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();

        int greaternumber;
        greaternumber = (a>b) ? a : b;
        System.out.println("Greatest Number is : " + greaternumber);
    }
}