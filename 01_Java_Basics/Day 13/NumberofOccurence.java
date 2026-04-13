import java.util.Scanner;

public class NumberofOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayInputUtility.inputArray();
        System.out.print("Enter the element you want to check occurance : ");
        int num = input.nextInt();
        System.out.println("Element comes " + occurance(numArray,num) + " times in Array");
    }
    public static int occurance(int myArr[], int a) {
        int count = 0;
        int i = 0;
        while (i < myArr.length) {
            if (myArr[i] == a) {
                count++;
            }
            i++;
        }
        return count;
    }
}