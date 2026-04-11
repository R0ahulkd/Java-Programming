import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not : ");
        int number = input.nextInt();
        if (prime(number) == 0) {
            System.out.println(number + " is not a Prime Number.");
        } else {
            System.out.println(number + " is a Prime Number.");
        }
    }
    public static int prime(int num) {
        if(num == 2){
            return 1;
        } else {
        Boolean p = true;
        int a = 2;
        while (p) {
            if (num % a == 0){
                return 0;
            } else {
                a++;
            }
            if (a == num){
                return 1;
            }
        }
        return 0;
    }
        }
}