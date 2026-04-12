import java.util.Scanner;

public class Patternproblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of rows you want : ");
        int num = input.nextInt();
        pattern1(num);
        System.out.println();
        pattern2(num);
        System.out.println();
        pattern3(num);
    }

    public static void pattern1(int a) {
        int i = 0;
        while (i < a) {
            int j = 0;
            while (j <= i) {
                System.out.print("*\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void pattern2(int a) {
        int i = a;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*\t");
                j++;
            }
            i--;
            System.out.println();
        }
    }

    public static void pattern3(int a) {
        int i = a;
        while (i >= 1) {
            int j = 1;
            while (j <= a) {
                if (j <= i - 1) {
                    System.out.print("\t");
                    j++;
                } else {
                    System.out.print("*\t");
                    j++;
                }
            }
            i--;
            System.out.println();
        }
    }
}