import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many fibonacci series number you want : ");
        int a = input.nextInt();
        Fibo(a);
    }
    public static void Fibo(int num) {
        int a = 0;
        int b = 1;
        int i = 1;
        if (num <= 1){
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
            while (i < num-1) {
                int c = a+b;
                a = b;
                b = c;
                System.out.println(c);
                i++;
            }
        }
    }
}