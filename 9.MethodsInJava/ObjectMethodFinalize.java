// WAP to demostrating finalize method

public class ObjectMethodFinalize {
    public static void main(String[] args) {
        ObjectMethodFinalize obj = new ObjectMethodFinalize();
        System.out.println(obj.hashCode());

        obj = null;

        // calling garbage collector
        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}