// WAP to explain How does the "final" keyword contribute to immutability

public final class ImmutablePoint {

    // final fields
    private final int x;
    private final int y;

    // Constructor initializes final fields
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Only getters (no setters)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // main method to run and test
    public static void main(String[] args) {

        ImmutablePoint point = new ImmutablePoint(10, 20);

        System.out.println("X value: " + point.getX());
        System.out.println("Y value: " + point.getY());

        // ❌ The following lines are NOT allowed (compile-time errors)
        // point.x = 30;
        // point.y = 40;

        System.out.println("Object is immutable. Values cannot be changed.");
    }
}
