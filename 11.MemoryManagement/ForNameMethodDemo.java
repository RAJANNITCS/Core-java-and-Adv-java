// WAP to demostrating Class.forName("") 

class Demo {

    static {
        System.out.println("run static block");
    }
}

public class ForNameMethodDemo {
    public static void main(String[] args) throws Exception {
        // Class.forName("Demo");

        // ClassLoader cl = ClassLoader.getSystemClassLoader();
        // Class<?> clazz = cl.loadClass("Demo");

        /// Now initialization happens here
        // Object obj = clazz.getDeclaredConstructor().newInstance();
    }
}