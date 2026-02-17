// WAP to demostrating Bounded Type Parameters with Classes

class GenericClass<T extends Number> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value : " + value);
    }
}

public class ParametersBoundWithClass {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<>(123);
        intObj.display(); // Output : value : 123

        GenericClass<Double> doubleObj = new GenericClass<>(45.67);
        doubleObj.display(); // Output : Value : 45.67

        // The following will cause a compile-time error because String does not extend Number
        // GenericClass<String> strObj = new GenericClass<>("Hello");
    } 
}
