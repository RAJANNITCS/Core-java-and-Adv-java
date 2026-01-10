// WAP to demostrating Reflection 

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Load the class
            Class<?> clazz = Class.forName("java.util.ArrayList");
            
            // Print class name
            System.out.println("Class name : " + clazz.getName());

            // Print implemented interfaces
            Class<?>[] interfaces = clazz.getInterfaces();
            System.out.println("Implemented Interfaces : ");
            for (Class<?> iface : interfaces) {
                System.out.println(iface.getName());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}