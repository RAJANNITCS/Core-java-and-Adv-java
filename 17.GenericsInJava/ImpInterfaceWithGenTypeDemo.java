// WAP to demostrating generics interface Implementing with a generically type
interface Container<T> {
    
    void add(T item);
    
    T get();
}

class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

public class ImpInterfaceWithGenTypeDemo {
    public static void main(String[] args) {
        GenericContainer<String> s1 = new GenericContainer<>();
        s1.add("hello");
        System.out.println("Item is = " + s1.get());
    }
}
