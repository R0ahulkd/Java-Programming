import java.util.Scanner;

public class greatest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        System.out.print("Enter Third Number : ");
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("First Number is Greatest");
            }
            else {
                System.out.println("Third number is Greatest");
            }
        }
        else {
            if (b > c){
                System.out.println("Second number is Greatest");
            }
            else {
                System.out.println("Third number is Greatest");
            }
        }
    }
}