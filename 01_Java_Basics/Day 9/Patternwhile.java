public class Patternwhile {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern() {
        int i = 1;
        while(i <= 5) {
            int j = 1;
            while(j <= i) {
                System.out.print("*\t");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
    }
}