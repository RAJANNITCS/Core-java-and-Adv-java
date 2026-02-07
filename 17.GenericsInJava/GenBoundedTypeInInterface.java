// WAP to demostrating Type Parameters and Bounded Types in Interfaces

interface NumberContainer<T extends Number> {

    void add(T item);

    T get();
}

class IntegerContainer implements NumberContainer<Integer> {
    private Integer item;

    @Override
    public void add(Integer item) {
        this.item = item;
    }

    @Override
    public Integer get() {
        return this.item;
    }
}

public class GenBoundedTypeInInterface {
    public static void main(String[] args) {
        IntegerContainer i1 = new IntegerContainer();
        i1.add(55);
        System.out.println("number is  = " + i1.get());
    }
}
