// WAP to demostrating Record 

record Person(String name, int age) {}

public class RecordSwitchExample {
    public static void main(String[] args) {

        Object obj = new Person("Amit", 25);

        String result = switch (obj) {

            case Person(String name, int age) -> 
                name + " is " + age + " years old ";

            default -> "Unknown";
        };

        System.out.println(result);
    }
}
