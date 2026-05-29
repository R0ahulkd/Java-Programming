package Exception_and_File_Handling.Day_31;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileWriter writer = new FileWriter(fileName);) {
            writer.write("My name is Rahul Kumar.");
            writer.flush();
            System.out.println("File Written Successfully.");
        } catch (IOException exception) {
            System.out.printf("Exception Occured %s\n",exception.getMessage());
        }
    }
}
