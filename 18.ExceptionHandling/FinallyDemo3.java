
public class FinallyDemo3 {
    
    public static int testMethod() {
        try {
            return 10;
        } finally {
            return 50; // This overrides previous return
        }
    }

    public static void main(String[] args) {
        System.out.println("return value is " + testMethod());
    }
}
