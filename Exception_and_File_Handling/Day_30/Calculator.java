package Exception_and_File_Handling.Day_30;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First number : ");
        int a = input.nextInt();
        System.out.print("Please Enter Sec nndumber : ");
        int b = input.nextInt();

        try {
            int result = a / b;
            System.out.printf("First divide by second : %d", result);
        } catch (ArithmeticException exception) {
            System.out.printf("Divide by zero not allowed. %s",exception.getMessage());
        }
    }
}
