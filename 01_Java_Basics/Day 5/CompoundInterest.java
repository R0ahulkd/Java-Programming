import java.util.Scanner;

public class CompoundInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        int p = input.nextInt();
        System.out.print("Enter the rate of Interest : ");
        double r = input.nextDouble();
        System.out.print("Enter the time : ");
        double t = input.nextDouble();
        double CI = p*(1+r/100)*t;
        System.out.println("Compound Interest = " + CI);
    }
}