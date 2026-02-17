// WAP to demostrating Multiple Bounds parameter

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My Number : " + this.value);
    }

    @Override
    public int intValue() {
        return this.value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Boxx<T extends Number & Printable> {
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class MultipleBoundParameter {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<>(myNumber);
        box.display();
    }
}
