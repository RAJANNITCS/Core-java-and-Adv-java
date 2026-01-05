// Write a program to explain this keywords refers to the instance variable

class Product {
    String name; // Instance variable

    public Product(String name) { // 'name' is a parameter
        this.name = name; // 'this.name' refers to the instance variable
    }

    public String getName() {
        return this.name;
    }
}

public class ThisKeywordsRefVariable {
    public static void main(String[] args) {
        Product p1 = new Product("rohan singh");
        System.out.println(p1.getName());
    }
}