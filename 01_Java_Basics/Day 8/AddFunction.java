import java.util.Scanner;

public class AddFunction {
    public static void main(String[] args) {
        System.out.println(Add() + 2);
    }

    public static int Add() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();

        return (a+b);
    }
}