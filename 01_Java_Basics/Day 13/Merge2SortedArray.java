public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] Arr1 = ArrayInputUtility.inputArray();
        int[] Arr2 = ArrayInputUtility.inputArray();
        int[] newArr = mergeSorted(Arr1, Arr2);
        int i = 0;
        while (i < newArr.length) {
            System.out.print(newArr[i] + "\t");
            i++;
        }
    }
    public static int[] mergeSorted(int[] Arr1, int[] Arr2) {
        int[] newArr = new int[Arr1.length + Arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < Arr1.length || j < Arr2.length) {
            if (j == Arr2.length || (i < Arr1.length && Arr1[i] < Arr2[j])) {
                newArr[k] = Arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = Arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}