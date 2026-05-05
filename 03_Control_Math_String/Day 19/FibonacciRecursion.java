import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many digits you want of Fibonacci series : ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(fibonaccirecursion(i) + "\t");
        }
    }
    public static int fibonaccirecursion (int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return (fibonaccirecursion(position-1) + fibonaccirecursion(position-2));
    }
}