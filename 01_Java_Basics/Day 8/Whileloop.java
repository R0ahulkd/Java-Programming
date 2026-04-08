import java.util.Scanner;

public class Whileloop {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = input.nextInt();
        while (a >= 1) {
            System.out.println(a);
            a -= 1;
        }
    }
}