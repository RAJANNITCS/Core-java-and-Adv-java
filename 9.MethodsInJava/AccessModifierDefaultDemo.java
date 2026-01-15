// WAP to demostrating Default Access modifier

class Car {
    String model; // default access
}

public class AccessModifierDefaultDemo {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.model = "Tesla"; // accessible within the same package
        System.out.println(obj.model);
    }
}