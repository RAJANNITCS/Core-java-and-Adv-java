// WAP to demostrating New methods in String class

// import java.util.stream.Stream;

public class NewStringMethodsExample {
    public static void main(String[] args) {

        // String s1 = ""; // empty string
        // String s2 = "  "; // spaces only
        // String s3 = "Hello"; // normal string
        // String s4 = "   Hello World   ";
        
        String s5 = "Hi ".repeat(3);

        // String text = "Java\nSpring\nMicroservices";

        // System.out.println(s1.isBlank()); // true
        // System.out.println(s2.isBlank()); // true
        // System.out.println(s3.isBlank()); // false

        // System.out.println(s4.strip()); // "Hello World";
        // System.out.println(s4.stripLeading()); // "Hello World ";
        // System.out.println(s4.stripTrailing()); // " Hello World";

        // Stream<String> lines = text.lines();

        // lines.forEach(System.out::println);

        // text.lines()
        //         .filter(line -> !line.isBlank())
        //         .forEach(System.out::println);

        System.out.println(s5);
    }
}
