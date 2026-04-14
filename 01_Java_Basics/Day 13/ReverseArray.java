public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = ArrayInputUtility.inputArray();
        int[] Arr = reverse(myArr);
        System.out.println("New Array After Reversal.");
        Display(Arr);
    }
    public static int[] reverse(int[] Arr) {
        int i = 0, j = Arr.length;
        while (i < Arr.length) {
            if (i == (Arr.length)/2) {
                break;
            }
            int temp = Arr[j-1];
            Arr[j-1] = Arr[i];
            Arr[i] = temp;
            i++;
            j--;
        }
        return Arr;
    }
    public static void Display(int[] Arr) {
        int i = 0;
        while (i < Arr.length) {
            System.out.println(Arr[i]);
            i++;
        }
    }
}