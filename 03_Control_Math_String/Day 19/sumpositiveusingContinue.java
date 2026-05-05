import java.util.Scanner;

public class sumpositiveusingContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayInputUtility.inputArray();
        System.out.println("Sum of all positive Number : " + Sum(array));
    }

    public static int Sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i < 0) {
                continue;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}