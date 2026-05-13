package Day_22.Practice;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul Kumar",30,25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Rahul");
        System.out.println(emp.getEmployeeDetails());
    }
}
