public class isArraySorted {
    public static void main(String[] args) {
        int[] myArr = ArrayInputUtility.inputArray();
        if (isSorted(myArr) == 1) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
    public static int isSorted(int[] Arr) {
        int i = 0;
        int min = Arr[0];
        while (i < Arr.length) {
            if (min > Arr[i]) {
                min = Arr[i];
            }
            i++;
        }
        if (min == Arr[0]) {
            return isAsc(Arr);
        } else if (min == Arr[Arr.length-1]) {
            return isDesc(Arr);
        } else {
            return 0;
        }
    }
    public static int isAsc(int[] Arr) {
        int i = 1;
        while (i < Arr.length) {
            if (Arr[i-1] > Arr[i]) {
                return 0;
            }
            i++;
        }
        return 1;
    }
    public static int isDesc(int[] Arr) {
        int i = 1;
        while (i < Arr.length) {
            if (Arr[i-1] < Arr[i]) {
                return 0;
            }
            i++;
        }
        return 1;
    }
}