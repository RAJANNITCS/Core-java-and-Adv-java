

public interface MainMethodInsideInterface {
    
    public static void main(String[] args) {
        System.out.println("Main method inside interface");

        // calling another static method
        showMessage();
    }

    // static method inside interface
    static void showMessage() {
        System.out.println("Static method inside interface");
    }
}
