public class UnaryOperator {
    static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(y);
        System.out.println(z);

        int p = 10;
        System.out.println(p++);
        System.out.println(p);
        int q = 12;
        System.out.println(++q);
        System.out.println(q);
    }
}