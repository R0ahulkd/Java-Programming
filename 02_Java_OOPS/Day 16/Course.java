public class Course {
    static int maxCapacity = 20;
    String courseName;
    int enrolledStudents;

    String[] enrolledStudentsName;

    Course (String courseName) {
        this.courseName = courseName;
        enrolledStudents = 0;
        this.enrolledStudentsName = new String[maxCapacity];
    }

    static int setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
        return maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudentsName[enrolledStudents] = studentName;
        enrolledStudents++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student Removed");
        enrolledStudents--;
    }
}