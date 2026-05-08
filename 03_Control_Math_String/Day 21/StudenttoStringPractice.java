public class StudenttoStringPractice {
    int age;
    String name;
    String rollNumber;

    public StudenttoStringPractice(int age, String name, String rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "StudenttoStringPractice{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudenttoStringPractice tostring = new StudenttoStringPractice(22,"Rahul Kumar","12503436");
        System.out.println(tostring.toString());
    }
}