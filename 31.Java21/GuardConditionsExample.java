// WAP to demostrating Gard Condations 

public class GuardConditionsExample {
    public static void main(String[] args) {
        Object obj = 150;

        String result = switch (obj) {
            case Integer i when i > 100 -> "Large number";

            case Integer i -> "Small number";

            default -> "other";
        };

        System.out.println(result);
    }
}

