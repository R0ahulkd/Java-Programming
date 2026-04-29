import java.util.Scanner;

public class PrimenumberFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not : ");
        int num = input.nextInt();
        String result = prime(num);
        System.out.println(result);
    }
    public static String prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return "Composite Number";
            }
        }
        return "Prime Number";
    }
}