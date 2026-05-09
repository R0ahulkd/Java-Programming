import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        String[] str = new String[] {"Hi,", "i", "am Rahul", "Kumar."};
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}