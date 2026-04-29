import java.util.Scanner;

public class BreakandContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i == 101) {
                break;
            }

            if (i == 5 ) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of Loop");
    }
}