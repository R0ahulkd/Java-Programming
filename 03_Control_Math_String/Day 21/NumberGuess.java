import java.util.Scanner;

public class NumberGuess {
        int Numberguess() {
            double random = Math.ceil(Math.random() * 100);
            return (int) random;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            NumberGuess dice = new NumberGuess();
            int num = dice.Numberguess();
            int n = 0;
            while (true) {
                System.out.print("Enter your Guess : ");
                n = input.nextInt();
                if (n < num) {
                    System.out.println("Guess High");
                } else if (n > num) {
                    System.out.println("Guess Low");
                } else {
                    System.out.println("Your Guess is Correct");
                    break;
                }
            }
            System.out.println("Guess Number is : " + num);
        }
    }