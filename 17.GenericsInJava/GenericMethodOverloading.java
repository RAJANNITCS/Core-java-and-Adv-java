// WAP to demostrating overload generic method

public class GenericMethodOverloading {
    
    public <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public void display(Integer element) {
        System.out.println("Display element " + element);
    }

    public static void main(String[] args) {
        GenericMethodOverloading obj = new GenericMethodOverloading();
        obj.display(42);   // Calls the Integer display method
        obj.display("Generics");  // Calls the generic display method
    }
}
