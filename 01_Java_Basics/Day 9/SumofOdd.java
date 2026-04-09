import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number upto which summ of odd numbers you want : ");
        int number = input.nextInt();
        System.out.println(OddSum(number));
    }
    public static int OddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            if (i%2 != 0) {
                sum += i;
            }
            i += 1;
        }
        return sum;
    }
}