// WAP to Loading plugin Dynamically using ClassLoader 

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class DynamicallyPluginLoader {
    public static void main(String[] args) throws Exception {
        
        // 1. Location of plugin JAR file
        File pluginJar = new File("report-plugin.jar");

        // 2. Convert JAR path to URL 
        URL jarUrl = pluginJar.toURI().toURL();

        // 3. Create a new ClassLoader for plugin
        URLClassLoader pluginClassLoader =
                new URLClassLoader(
                        new URL[]{jarUrl},
                        Plugin.class.getClassLoader()
                );

        // 4. Load plugin class by name
        Class<?> pluginClass =
                pluginClassLoader.loadClass("ReportPlugin");

        // 5. Create instance using reflection
        Plugin plugin =
                (Plugin) pluginClass
                        .getDeclaredConstructor()
                        .newInstance();

        // 6. Execute plugin logic
        plugin.execute();

    }
}