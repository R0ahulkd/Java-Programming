public class Array1 {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        int[] myArr2 = {5,10,15,20,25};
        int index = 1;
        System.out.println(myArr2[index]);

        int i = 0;
        while (i < 5) {
            System.out.println(myArr2[i]);
            i++;
        }
    }
}