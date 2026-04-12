public class Patternproblem {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
    }

    public static void pattern1() {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j <= i) {
                System.out.print("*\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public static void pattern2() {
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*\t");
                j++;
            }
            i--;
            System.out.println();
        }
    }

    public static void pattern3() {
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= 5) {
                if (j <= i - 1) {
                    System.out.print("\t");
                    j++;
                } else {
                    System.out.print("*\t");
                    j++;
                }
            }
            i--;
            System.out.println();
        }
    }
}