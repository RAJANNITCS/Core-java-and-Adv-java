// WAP to demostrating autocloseable interface

class MyResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("close method call");
    }

}

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            // use resource
            System.out.println("Hello World !!!!");
        }
    }
}
