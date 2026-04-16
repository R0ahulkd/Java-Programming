public class SumofDiagonals {
    public static void main(String[] args) {
        int[][] Arr = SearchElement2dArray.InputArray();
        int sum = SumofDiagonals(Arr);
        System.out.println("Sum of Diagonals : " + sum);
    }
    public static int SumofDiagonals(int[][] myArr) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < myArr.length) {
            j = i;
            sum += myArr[i][j];
            i++;
        }
        j = 0;
        i = myArr[0].length-1;
        while (i >= 0) {
            if (i != j) {
                sum += myArr[j][i];
            }
            j++;
            i--;
        }
        return sum;
    }
}