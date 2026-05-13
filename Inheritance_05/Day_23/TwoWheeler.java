package Inheritance_05.Day_23;

public class TwoWheeler extends Vehicle {
    TwoWheeler() {
        numberOfTires = 2;
    }

    public void balance() {
        System.out.println("I am balancing on two tires.");
    }
}
