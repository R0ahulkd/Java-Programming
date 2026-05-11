package Day_22.coding2;

import Day_22.gettersetter.Car4;

public class GetterTest {
    public static void main(String[] args) {
        Car4 car = new Car4("Red","Suzuki",3,8000);
        car.setColor("Blue");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
