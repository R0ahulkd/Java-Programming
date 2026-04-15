import java.util.Scanner;

public class SearchElement2dArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Arr = InputArray();
        System.out.print("Which Element you want to Search : ");
        int search = input.nextInt();
        Search(search,Arr);
        }
        public static int[][] InputArray() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Number of Rows : ");
            int r = input.nextInt();
            System.out.print("Enter Number of Columns : ");
            int c = input.nextInt();
            int[][] Arr = new int[r][c];
            int i = 0, j = 0;
            while (i < r) {
                j = 0;
                while (j < c) {
                    System.out.print("Enter Element of Row " + (i+1) + " and Column " + (j+1) + " : ");
                    Arr[i][j] = input.nextInt();
                    j++;
                }
                i++;
            }
            return Arr;
        }
        public static void Search(int num, int[][] Arr) {
            int i = 0, j = 0;
            while (i < Arr.length) {
                j = 0;
                while (j < Arr[i].length) {
                    if (Arr[i][j] == num) {
                        System.out.print("Element found on Row " + (i+1) + " and Column " + (j+1));
                    }
                    j++;
                }
                i++;
            }
        }
    }