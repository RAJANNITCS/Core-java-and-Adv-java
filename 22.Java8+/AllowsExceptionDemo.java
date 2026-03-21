// WAP to demostrating Functional Interface Allows exception 

@FunctionalInterface
interface MyInterface {
    public void process();
}


public class AllowsExceptionDemo {
    public static void main(String[] args) {
        MyInterface obj = () -> {
            try {
                throw new Exception("Something went wrong");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       
        };

        obj.process();
    }
}
