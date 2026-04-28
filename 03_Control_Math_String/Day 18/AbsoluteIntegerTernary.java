import java.util.Scanner;

public class AbsoluteIntegerTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = input.nextInt();
        int num = (a<0) ? -a : a;
        System.out.println(num);
    }
}