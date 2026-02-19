// WAP to achive abstraction using Composition 

class Engine {
    public void start() {
        System.out.println("Engine start....");
    }
}

class Car {
    Engine engine = null; // Composition

    public Car() {
        engine = new Engine();
    }

    public void drive() {
        engine.start(); // internal delegation
        System.out.println("Car is moving");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.drive();
    }
}
