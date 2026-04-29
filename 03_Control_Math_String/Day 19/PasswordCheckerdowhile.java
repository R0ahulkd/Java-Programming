import java.util.Scanner;

public class PasswordCheckerdowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter your Password : ");
            password = input.next();
        } while (!isValidPassword(password));
            System.out.println("Thanks for entering a valid Password.");
    }
    public static boolean isValidPassword(String password) {
        return  password.length() > 6;
    }
}