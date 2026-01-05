// WAP to explain Can 'this' keyword be assigned a new value

class MyObject {
    int value;

    public MyObject(int value) {
        this.value = value;
    }

    public void tryToChangeThis() {
        // THIS IS NOT ALLOWED AND WILL CAUSE A COMPILE-TIME ERROR
        // this = new MyObject(200); // You cannot reassign 'this'
    }
}

public class AssignedNewValue {
    public static void main(String[] args) {
        MyObject obj = new MyObject(22);
        obj.tryToChangeThis();
    }
}

