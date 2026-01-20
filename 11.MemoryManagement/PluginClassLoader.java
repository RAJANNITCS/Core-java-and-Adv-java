// WAP to create custome class loader 

class Plugin {
    static {
        System.out.println("Custome class load load plugin class");
    }
}

// Custom class loader to load classes dynamically
class CustomeClassLoader extends ClassLoader {
    // Load class bytes manually
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        // Convert class name to path
        String path = className.replace('.', '/') + ".class";

        // Load class bytes from disk (simplified)
        byte[] classBytes = loadClassBytes(path);

        // Define the class in JVM
        return defineClass(className, classBytes, 0, classBytes.length);
    }

    // Dummy method to represent class byte loading
    private byte[] loadClassBytes(String path) {
        return new byte[0]; // simplified for example
    }
}


public class PluginClassLoader {
    public static void main(String[] args) throws Exception {
        // Create custom class loader
        CustomeClassLoader loader = new CustomeClassLoader();

        // Load class using custom loader
        Class<?> pluginClass = loader.loadClass("Plugin");

        // Create instance
        Object plugin = pluginClass.getDeclaredConstructor()
                        .newInstance();

        
        // // Remove references
        plugin = null;
        pluginClass = null;
        loader = null;

        // // Request garbage collection
        System.gc(); // JVM decides whether to run GC
    }
}
