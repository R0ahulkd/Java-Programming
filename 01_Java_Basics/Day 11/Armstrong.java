//import java.util.Scanner;
//
//public class Armstrong {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number to calculate armstrong : ");
//        int a = input.nextInt();
//        double result = arm(a);
//        int res = (int) result;
//        if (res == a) {
//            System.out.println("Number is Armstrong");
//        } else {
//            System.out.println("Number is not a Armstrong number");
//        }
//    }
//    public static double arm(int num) {
//        int a = 0;
//        int count = 0;
//        int b = num;
//        while (a < num) {
//            num /= 10;
//            count++;
//        }
//        num = b;
//        double result = 0;
//        double c;
//        double dcount = count;
//        while (a < num) {
//            c = (num % 10);
//            result += Math.pow(c,count);
//            num = num / 10;
//        }
//        System.out.println(result);
//        return result;
//    }
//}

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}