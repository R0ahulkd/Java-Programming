public class forEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Rahul","Ram","Mohan","Sohan"
        };
        printArray(array);
    }
    public static void printArray(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }
}