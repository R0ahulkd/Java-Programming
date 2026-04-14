public class isArrayPalindrome {
    public static void main(String[] args) {
        int[] Arr = ArrayInputUtility.inputArray();
        int[] reverseArr = reverseArray(Arr);
        boolean result = matchArray(Arr,reverseArr);
        if (result) {
            System.out.println("Array is Palindrome.");
        } else {
            System.out.println("Array is not Palindrome.");
        }
    }
    public static boolean matchArray(int[] Arr,int[] reverseArr) {
        int i = 0;
        while (i < Arr.length) {
            if (Arr[i] != reverseArr[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static int[] reverseArray(int[] myArr) {
        int i = 0;
        int[] newArr = new int[myArr.length];
        while (i < myArr.length) {
            newArr[i] = myArr[myArr.length - 1 - i];
            i++;
        }
        return newArr;
    }
}