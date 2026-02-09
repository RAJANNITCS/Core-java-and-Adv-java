// WAP to demostrating Member inner class 

class Car {

    private String model = "Tesla";

    class Engine {
        void showCarModel() {
            // Accessing outer class private variable
            System.out.println(model);
        }
    }
}

public class MemberInnerClassDemo {
    public static void main(String[] args) {

        Car car = new Car(); // Outer class Object
        Car.Engine engine = car.new Engine(); // Inner class object 
        engine.showCarModel();
    }
}
