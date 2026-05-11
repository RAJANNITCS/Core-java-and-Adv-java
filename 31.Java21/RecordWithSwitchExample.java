// WAP to demostrating Record with Switch case

record Circle(double radiuse) {}

record Rectangle(double length, double width) {}

public class RecordWithSwitchExample {
    public static void main(String[] args) {

        Object shape = new Circle(10);

        String result = switch(shape) {

            case Circle(double r) -> "Circle radius = " + r;

            case Rectangle(double l, double w) -> "Rectangle";

            default -> "Unknown";

        };

        System.out.println(result);
    }
}
