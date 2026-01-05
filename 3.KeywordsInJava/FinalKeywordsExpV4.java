// WAP to design a class in such a way that it should not be extended nor should its core methods be overridden

// 🚫 Class cannot be extended
final class ConfigurationManager { 

    private String configFilePath;

    public ConfigurationManager(String path) {
        this.configFilePath = path;
        System.out.println("ConfigurationManager initialized with path: " + path);
    }

    // 🚫 Method cannot be overridden
    public final void loadConfiguration() { 
        System.out.println("Loading configuration from: " + configFilePath);
        // Complex logic here (e.g., read config file, parse values)
    }

    public String getConfigFilePath() {
        return configFilePath;
    }

    public void displayStatus() {
        System.out.println("ConfigurationManager is active.");
    }
}

public class FinalKeywordsExpV4 {
    public static void main(String[] args) {
        ConfigurationManager obj = new ConfigurationManager("/txt/ref.java");
        obj.displayStatus();
    }
}
