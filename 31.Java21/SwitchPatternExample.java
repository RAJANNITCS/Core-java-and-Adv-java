// WAP to demostrating Switch case 

public class SwitchPatternExample {
    public static void main(String[] args) {

        Object obj = "Hello";

        String result = switch (obj) {

            // if obj is string , assign to s
            case String s -> "String value : " + s;

            // if obj is Integer , assign to i
            case Integer i -> "Integer value : " + i;

            // Default case 
            default -> "Unknown type";

        };

        System.out.println(result);
    }
}
