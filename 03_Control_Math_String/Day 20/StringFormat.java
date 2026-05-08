public class StringFormat {
    public static void main(String[] args) {
        int marks = 45;
        String name = "Rahul";
        System.out.println("Hello " + name + " ,your marks are " + marks);
        System.out.printf("Hello %s ,your marks are %d\n", name, marks);
        System.out.printf("Hello %15s ,your marks are %d\n", name, marks);
        System.out.printf("Hello %-10s ,your marks are %d\n", name, marks);
        System.out.printf("Hello %S ,your marks are %d\n", name, marks);
    }
}