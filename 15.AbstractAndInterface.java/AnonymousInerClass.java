// WAP to demostrating Annonymous Inner class

public class AnonymousInerClass {
    public static void main(String[] args) {


        // before java 8 use
        Runnable task = new Runnable() {

            @Override
            public void run() {
                System.out.println("Task running");
            }
        };

        // task.run();

        // After java 8 
        Runnable task1 = () -> System.out.println("Task 1 running ");

        task1.run();
    }
}
