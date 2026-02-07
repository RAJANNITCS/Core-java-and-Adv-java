// WAP to demostrating generics interface Implementing with a specific type

interface Container<T> {
    
    void add(T item);
    
    T get();
}

class StringContainer implements Container<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}

public class ImpInterfaceWithSpeTypeDemo {
    public static void main(String[] args) {
        StringContainer s1 = new StringContainer();
        s1.add("item-1");
        System.out.println("item is = " + s1.get());
    }
}
