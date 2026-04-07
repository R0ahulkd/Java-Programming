import java.util.Scanner;

public class Greatest2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        System.out.print("Enter Third Number : ");
        int c = input.nextInt();

        if(a >= b && a >= c){
            System.out.println(a + " is Greatest");
        } else if (b >= c) {
            System.out.println(b + " is Greatest");
        }
        else {
            System.out.println(c + " is Greatest");
        }
    }
}