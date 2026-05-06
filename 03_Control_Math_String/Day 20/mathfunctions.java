public class mathfunctions {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.round(5.57));

        System.out.println(Math.random());
        for (int i = 1; i <= 10; i++) {
            long random = Math.round(Math.random()*100);
            System.out.println(random);
        }

        System.out.println(Math.PI);
    }
}