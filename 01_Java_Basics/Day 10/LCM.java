import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter Second number : ");
        int b = input.nextInt();
        System.out.println(LCMofnumbers(a,b));
    }
    public static int LCMofnumbers(int first, int second){
            int num = 1;
            int i = first;
            while (i % second != 0) {
                i = first;
                i *= num;
                num += 1;
            }
            return i;
        }
    }