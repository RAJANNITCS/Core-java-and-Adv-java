// WAP to load plugin dynamic 

// common interface for all plugins 
interface PaymentPlugin {
    void pay();
}

// Plugin 1
class CreditCardPlugin implements PaymentPlugin {
    public void pay() {
        System.out.println("Payment done using Credit card");
    }
}

// plugin 2
class UpiPlugin implements PaymentPlugin {
    public void pay() {
        System.out.println("Payment done using upi");
    }
}

public class PluginLoader {
    public static void main(String[] args) throws Exception {

        // Plugin class name come at runtime
        String pluginClassName = "UpiPlugin";

        // Load class dynamically
        Class<?> clazz = Class.forName(pluginClassName);

        // Create object dynamically
        PaymentPlugin plugin = (PaymentPlugin) clazz.getDeclaredConstructor().newInstance();

        plugin.pay();
    }
}