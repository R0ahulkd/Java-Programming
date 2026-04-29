import java.util.Scanner;

public class GradeTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of the Student : ");
        int marks = input.nextInt();

        String Grade = (marks > 80) ? "Excellent" : (marks > 60) ? "Good" : ((marks > 40) ? "Pass" : "Fail");
        System.out.println(Grade);
    }
}