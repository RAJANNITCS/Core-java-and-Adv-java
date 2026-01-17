// WAP to demostrating toString() in object class 

public class ObjectMethodToStringDemo {

    String name = "rohan singh";
    int age = 21;

    @Override
    public String toString() {
        return "Student { name = '" + name + "', age = " + age + "}";
    }

    public static void main(String[] args) {
        ObjectMethodToStringDemo obj = new ObjectMethodToStringDemo();
        System.out.println(obj.toString());
    }
}