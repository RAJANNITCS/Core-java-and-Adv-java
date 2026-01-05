// WAP To call immediate parent class methods using super keywords

class Vehicle {

    void move() { 
        System.out.println("Vehicle is moving."); 
    }

}

class Car extends Vehicle {

    @Override
    void move() {
        super.move(); // Calls Vehicle's move() method
        System.out.println("Car is moving faster.");
    }
}

public class SuperKeywordsExpV2 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.move();
    }
}