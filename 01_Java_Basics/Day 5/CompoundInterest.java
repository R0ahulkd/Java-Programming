import java.util.Scanner;

public class CompoundInterest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount : ");
        int p = input.nextInt();
        System.out.print("Enter the rate of Interest : ");
        float r = input.nextFloat();
        System.out.print("Enter the time : ");
        float t = input.nextFloat();
        double CI = p * Math.pow((1+r/100),t);
        System.out.println("Compound Interest = " + CI);
    }
}