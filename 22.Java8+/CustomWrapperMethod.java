// WAP to handle exception in labda using custom wrapper method


public class CustomWrapperMethod {
    
    public static Runnable wrap(Runnable r) {
        return () -> {
            try {
                r.run();
            } catch (Exception e) {
                System.out.println("Handled in wrapper");
            }
        };
    }

    public static void main(String[] args) {
        Runnable obj = wrap(() -> {
            throw new RuntimeException("Error");
        });

        new Thread(obj).start();
    }
}
