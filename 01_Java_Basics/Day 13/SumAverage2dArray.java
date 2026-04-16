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
        double sum1 = (double) sum;
        double count1 = (double) count;
        double average = (sum1/count1);
        System.out.println("Average of All Elements : " + average);
    }
}