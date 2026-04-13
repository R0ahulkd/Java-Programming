import java.util.Scanner;

public class ArrayInputUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of elements : ");
        int num = input.nextInt();
        int[] arr = new int[num];
        int i = 0;
        while (i < arr.length){
            System.out.print("Enter Elements No. " + (i+1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
}