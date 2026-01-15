// WAP to demostrating Protected access modifier

class Vehicle {
    protected int speed; // protected member
}

class Bike extends Vehicle {

    public void setSpeed(int var) {
        this.speed  = var;
    }

    public int getSpeed() {
        return this.speed;
    }

}

public class AccessModifierProtectedDemo {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.setSpeed(100);
        System.out.println("Access via subclass method : " + obj.getSpeed());

        Vehicle vObj = new Vehicle();
        System.out.println(vObj.speed);
    }
}