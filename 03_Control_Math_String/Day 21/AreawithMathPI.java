import java.util.Scanner;

public class AreawithMathPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int num = input.nextInt();
        double cr = 2 * (Math.PI * num);
        double area = Math.PI * Math.pow(num,2);
        System.out.printf("Circumference of the Circle is %f\n",cr);
        System.out.printf("Area of the Circle is %f",area);
    }
}