// WAP to demostrating constructor in java 

class Product {
    private int id;
    private String name;
    private double price;

    // 1. No-Argument Constructor
    public Product() {
        // Setting default values for every new product
        this.id = 0;
        this.name = "Unknown Item";
        this.price = 0.0;
        System.out.println("Default Product Created.");
    }

    // 2. Parameterized Constructor
    public Product(int id, String name, double price) {
        // 'this.id' refers to the class variable
        // 'id' refers to the parameter passed in the bracket
        this.id = id;
        this.name = name;
        this.price = price;
        System.out.println("Custom Product Created: " + name);
    }

    public void display() {
        System.out.println(id + " | " + name + " | $" + price);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Calls the No-Arg Constructor
        Product p1 = new Product();
        p1.display();

        // Calls the Parameterized Constructor
        Product p2 = new Product(101, "Laptop", 1200.00);
        p2.display();
    }
}