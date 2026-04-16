public class SumAverage2dArray {
    public static void main(String[] args) {
        int[][] Arr = SearchElement2dArray.InputArray();
        Sum(Arr);
    }

    public static void Sum(int[][] myArr) {
        int i = 0, j = 0;
        int sum = 0, count = 0;
        while (i < myArr.length) {
            j = 0;
            while (j < myArr[i].length) {
                sum += myArr[i][j];
                j++;
                count++;
            }
            i++;
        }
        System.out.println("Sum of All Elements : " + sum);
        double average = sum/count;
        System.out.println("Average of All Elements : " + average);
    }
}