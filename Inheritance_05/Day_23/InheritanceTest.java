package Inheritance_05.Day_23;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass() );

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        Motorcycle motor = new Motorcycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
