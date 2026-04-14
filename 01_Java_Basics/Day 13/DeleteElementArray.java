import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int [] myArr = ArrayInputUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Element which you want to delete : ");
        int num = input.nextInt();
        newArray(myArr,num);
    }
    public static void newArray(int[] Arr,int num) {
        int i = 0;
        int count = Arr.length;
        while (i < Arr.length) {
            if (Arr[i] == num) {
                count--;
            }
            i++;
        }
        int[] newArr = new int[count];
        i = 0;
        int j = 0;
        while (i < Arr.length) {
            if (Arr[i] != num) {
                newArr[j] = Arr[i];
                j++;
            }
            i++;
        }
        i = 0;
        System.out.println("New Array After Deletion of " + num);
        while (i < newArr.length) {
            System.out.println(newArr[i]);
            i++;
        }
    }
}