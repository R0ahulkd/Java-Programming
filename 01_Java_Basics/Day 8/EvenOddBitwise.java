import java.util.Scanner;

public class EvenOddBitwise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
        if ((a & 1) == 1){
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even");
        }
    }
}
