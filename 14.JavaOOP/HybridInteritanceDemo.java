// WAP to demostranting HybridInteritance 

// Parent class
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Interface
interface Fare {

    double calculateFare(int distance);
}

// ---------- Single Inheritance ----------
class Car extends Vehicle {

    void carType() {
        System.out.println("This is a Car");
    }
}

// ---------- Hybrid Inheritance ----------
class Bus extends Vehicle implements Fare {

    @Override
    public double calculateFare(int distance) {
        return distance * 5.0;   // fare per km
    }

    void busType() {
        System.out.println("This is a Bus");
    }
}

// ---------- Test Class ----------
public class HybridInteritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance
        Car car = new Car();
        car.start();      // from Vehicle
        car.carType();

        System.out.println();

        // Hybrid Inheritance
        Bus bus = new Bus();
        bus.start();      // from Vehicle
        bus.busType();
        System.out.println("Fare = " + bus.calculateFare(10));
    }
}
