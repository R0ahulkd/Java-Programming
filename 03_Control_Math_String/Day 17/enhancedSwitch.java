import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number 1 - 7 : ");
        int day = input.nextInt();

        String output = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7,8 -> "Sunday";
            default -> "Invalid Input";
        };
        System.out.println(output);
    }
}