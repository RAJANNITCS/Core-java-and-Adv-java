// WAP to demostrating equals method

public class ObjectMethodEqualDemo {
    String title;

    ObjectMethodEqualDemo(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        ObjectMethodEqualDemo obj1Demo = (ObjectMethodEqualDemo) obj;
        return this.title.equals(obj1Demo.title);
    }

    public static void main(String[] args) {
        ObjectMethodEqualDemo obj1 = new ObjectMethodEqualDemo("Java");
        ObjectMethodEqualDemo obj2 = new ObjectMethodEqualDemo("Java");

        System.out.println(obj1.equals(obj2));
    }
}