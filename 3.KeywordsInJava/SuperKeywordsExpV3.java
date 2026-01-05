// WAP To call immediate parent class constructors using super keywords

class Shape {
    String color;

    public Shape(String color) { 
        this.color = color; 
    }
}

class Circle extends Shape {
    public Circle(String color) {
        super(color); // Calls Shape's constructor to set color
    }

    public String getName() {
        return this.color;
    }
}

public class SuperKeywordsExpV3 {
    public static void main(String[] args) {
        Circle obj = new Circle("red");
        System.out.println(obj.getName());
    }
}