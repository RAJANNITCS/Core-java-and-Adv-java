// WAP to explain How final helps in Thread Safety

// SharedData.java
public class SharedData {

    private final String name;
    private final int id;

    // Constructor initializes final variables
    public SharedData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Only getters (no setters)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // main method to test thread safety
    public static void main(String[] args) {

        // Thread 1: creates the immutable object
        SharedData data = new SharedData("Data", 123);

        // Thread 2: reads the data
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 reads:");
            System.out.println("Name: " + data.getName());
            System.out.println("ID: " + data.getId());
        });

        // Thread 3: reads the same data
        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 reads:");
            System.out.println("Name: " + data.getName());
            System.out.println("ID: " + data.getId());
        });

        t1.start();
        t2.start();
    }
}
