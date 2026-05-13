package Inheritance_05.Day_23;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

        Motorcycle motor = new Motorcycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
