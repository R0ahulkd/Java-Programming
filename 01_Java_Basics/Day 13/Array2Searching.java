import java.util.Scanner;

public class Array2Searching {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < myArr.length) {
            System.out.print("Enter Element " + i + " : ");
            myArr[i] = input.nextInt();
            i++;
        }
        System.out.print("Enter a number you want to find in array : ");
        int num = input.nextInt();
        i = 0;
        while (i < myArr.length) {
            if (myArr[i] == num) {
                System.out.print("Yes Element found in index " + i);
                break;
            }
            i++;
            if (i == 4) {
                System.out.println("No Element not present in Array.");
            }
        }
    }
}