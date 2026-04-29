import java.util.Scanner;

public class maxinArrayforeach {
    public static void main(String[] args) {
        int[] array = new int[] {
                8,5,1,4,98,36
        };
        System.out.print(maxArray(array));
    }
    public static int maxArray(int[] array) {
        int max = 0;
        for (int i : array) {
           if (i > max) {
               max = i;
           }
        }
        return max;
    }
}