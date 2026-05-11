package Day_22.coding;

public class AccessTest {
    public static void main(String[] args) {
        Car4 car = new Car4();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 5000;
        Car4 newCar = new Car4("black","BMW",1,5000);
        System.out.println(car);
        System.out.println(newCar);

        DefaultClass def = new DefaultClass();
    }
}
