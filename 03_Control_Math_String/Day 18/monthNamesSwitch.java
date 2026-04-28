import java.util.Scanner;

public class monthNamesSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number between 1 to 12 : ");
        int num = input.nextInt();

        String output = switch (num) {
            case 1 -> "Januray";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Input";
        };
        System.out.println(output);
    }
}