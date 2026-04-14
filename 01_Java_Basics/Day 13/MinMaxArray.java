public class MinMaxArray {
    public static void main(String[] args) {
        int[] myArr = ArrayInputUtility.inputArray();
        MinMax(myArr);
    }
    public static void MinMax(int[] Arr) {
        int i = 0;
        int min = Arr[0];
        int max = Arr[0];
        while (i < Arr.length) {
            if (min > Arr[i]) {
                min = Arr[i];
            }
            i++;
        }
        i = 0;
        while (i < Arr.length) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
            i++;
        }
        System.out.println("Greatest Element in Array is " + max);
        System.out.print("Smallest Element in Array is " + min);
    }
}