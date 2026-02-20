
public class FinallyDemo2 {

    public static int testMethod() {
        try {
            int x = 10 / 0;  // ArithmeticException
        } catch (Exception e) {
            System.out.println("Inside catch");
            return 20;   // return inside catch
        } finally {
            System.out.println("Inside finally");
        }
        return 0;
    }

    
    public static void main(String[] args) {
        int result = testMethod();
        System.out.println("Returned Value: " + result);
    }
}
