// WAP to creating plugin

// Every plugin must implement this interface
interface Plugin {

    // Method that plugin must implement
    void execute();

}

public class ReportPlugin implements Plugin {
    
    // This method will be called by main app
    @Override
    public void execute() {

        // Business logic of plugin
        System.out.println("Report plugin Executed");
    }
}