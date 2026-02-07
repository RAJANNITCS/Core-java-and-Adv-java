// WAP to demostrating generics type class 

class Box<T> { // one or more type parameters
    // These type parameters are placeholders that are replaced with specific types
    
    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

public class GenericClassDemo {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(); // Box is now type-safe
        box.setValue(1); // No issue, it's an Integer
        Integer i = box.getValue(); // No casting needed
        System.out.println(i);
    }
}
