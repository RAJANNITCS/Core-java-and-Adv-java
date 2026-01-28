// WAP to demostrating ClassNotFoundExcepiton

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // We are manually trying to load a class using a String name
            // This class does not exist in our project
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // We MUST catch this because it is a checked exception
            System.out.println("Wait! The Driver class is missing from the classpath.");
            e.printStackTrace();
        }
    }
}