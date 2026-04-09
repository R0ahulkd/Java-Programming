public class parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(4,7); //Arguments
        System.out.println(num);
    }

    public static int sumTwoNumbers(int first, int second) {    //Parameters
        int sum = first + second;
        return sum;
    }
}