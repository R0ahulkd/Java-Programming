public class isArraySorted {
    public static void main(String[] args) {
        int[] myArr = ArrayInputUtility.inputArray();
        Boolean result = isSorted(myArr);
        if (result){
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
    public static boolean isSorted(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}