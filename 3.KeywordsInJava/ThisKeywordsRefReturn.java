// Write a program to explain this keywords use to return current object

class Car {
    String color;

    public Car setColor(String color) {
        this.color = color;
        return this; // Returns the current Car object
    }

    public String getColor() {
        return this.color;
    }
}

public class ThisKeywordsRefReturn {
    public static void main(String[] args) {
        Car obj = new Car();
        Car obj1 = obj.setColor("red");
        System.out.println(obj1.getColor());
    }
}