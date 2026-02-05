// WAP to demostrating abstraction

abstract class TV {

    abstract void turnOn();
    abstract void turnOff();

}

// Concrete class implementing the abstract method
class TVRemote extends TV {

    @Override
    public void turnOn() {

        System.out.println("TV is turned ON.");

    }

    @Override
    public void turnOff() {
        
        System.out.println("TV is turn Off");

    }
}

public class AbstractionDemo { 
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}