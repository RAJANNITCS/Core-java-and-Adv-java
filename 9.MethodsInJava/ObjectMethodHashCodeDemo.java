// WAP to demostrating hasCode method in object class

public class ObjectMethodHashCodeDemo {
    int id = 101;

    @Override
    public int hashCode() {
        return (id * 31); // Simple custom hash
    }

    public static void main(String[] artgs) {
        ObjectMethodHashCodeDemo obj = new ObjectMethodHashCodeDemo();
        System.out.println(obj.hashCode());
    }
}