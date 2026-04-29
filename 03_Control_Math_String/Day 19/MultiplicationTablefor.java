import java.util.Scanner;

public class MultiplicationTablefor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which number table you want : ");
        int num = input.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}