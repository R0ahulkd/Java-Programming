package Day_22.example.utils;

import Day_22.example.geometry.Circle;
import Day_22.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        System.out.println(rec.rectangle(3,4));
        System.out.printf("%.2f",cir.circle(3));
    }
}