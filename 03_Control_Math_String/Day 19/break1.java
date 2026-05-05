import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a command : ");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }
    }
}