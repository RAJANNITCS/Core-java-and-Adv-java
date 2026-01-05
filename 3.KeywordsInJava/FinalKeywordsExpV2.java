// WAP to explain use final keyword with Methods

// Parent class
class CarManufacturer {

    // This method cannot be changed by subclasses
    final void startEngine() { 
        System.out.println("Patented engine start sequence activated.");
    }

    void drive() {
        System.out.println("Car is driving.");
    }

}

// Child class
class SportsCar extends CarManufacturer { 
    // ❌ ERROR! Cannot override a final method.
    // void startEngine() {
    //     System.out.println("Sporty engine start!");
    // }

    // This non-final method can be overridden
    @Override
    void drive() { 
        System.out.println("Sports car is driving fast!");
    }
}

public class FinalKeywordsExpV2 {
    public static void main(String[] args) {
        SportsCar obj = new SportsCar();
        obj.startEngine();
    }
}
