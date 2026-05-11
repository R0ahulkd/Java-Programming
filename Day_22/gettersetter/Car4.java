package Day_22.gettersetter;

public class Car4 {
    private String color; //public
    private String model; //public
    private double fuelLevel;
    private long costOfPurchase; //default

    public Car4(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor() {
        return color;
    }

    public String getModel(){
        return model;
    }
}
