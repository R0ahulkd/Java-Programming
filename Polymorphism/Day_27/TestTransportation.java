package Polymorphism.Day_27;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle vCar = new Car();
        Car cVehicle = (Car) new Vehicle(); //Explicit Cast
    }
}
