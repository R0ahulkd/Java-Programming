import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int table = input.nextInt();
        Table(table);
    }
    public static void Table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + num*i);
            i += 1;
        }
    }
}