import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        boolean start = true;
        while (start == true) {
            System.out.print("Please Enter Input : ");
            in = input.nextLine();
            System.out.println(in);
            if (in == "exit") {
                start = false;
            }
        }
    }
}