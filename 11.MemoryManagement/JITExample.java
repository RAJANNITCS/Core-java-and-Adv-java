// WAP to show JIT execution 

public class JITExample {

    static int calculate(int value) {
        return value * 2;
    }

    public static void main(String[] args) {

        // Loop runs many times
        // JVM identifies this as "hot code"
        for (int i = 0; i < 1000000; i++) {
            System.out.println(JITExample.calculate(i));
        }
    }
}