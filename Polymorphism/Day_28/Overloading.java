package Polymorphism.Day_28;

public class Overloading {
    public int sum (int a,int b) {
        return a + b;
    }

    public int sum (int a,int b,int c,int d) {
        return a + b+ c + d;
    }

    public String sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        System.out.println(overload.sum(5,3));
        System.out.println(overload.sum(1,2,4,3));
        System.out.println(overload.sum("Rahul"," Kumar"));
    }
}
