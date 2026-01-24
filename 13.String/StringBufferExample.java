// WAP to demostrating String buffer class

public class StringBufferExample {

    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        // Modify the same object
        sb.append(" Developer");

        // Print result
        System.out.println(sb);
    }
}
