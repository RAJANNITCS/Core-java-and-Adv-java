
// Immutable configration object

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class AppConfig {

    // configuration fields
    private final int timeout;
    private final int maxConnections;
    private final boolean featureEnabled;

    // constructor to initialize configuration
    public AppConfig(int timeout, int maxConnections, boolean featureEnabled) {
        this.timeout = timeout;
        this.maxConnections = maxConnections;
        this.featureEnabled = featureEnabled;
    }

     // getter for timeout
    public int getTimeout() {
        return timeout;
    }

    // getter for max connections
    public int getMaxConnections() {
        return maxConnections;
    }

    // getter for feature flag
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }

    @Override
    public String toString() {
        return "Time out = " + this.timeout + " Max connection = " + this.maxConnections + " Feature enabnled = " + this.featureEnabled;
    }

}

class ConfigManagerSer {
    // // atomic reference holding current configuration
    // private final AtomicReference<AppConfig> configRef =
    //         new AtomicReference<>(new AppConfig(30, 100, true));

    // // read configuration
    // public AppConfig getConfig() {
    //     return configRef.get();
    // }

    // // update configuration
    // public void updateConfig(AppConfig newConfig) {
    //     configRef.set(newConfig);
    // }

    private AppConfig config;

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public AppConfig getConfig() {
        lock.readLock().lock();
        try {
            return config;
        } finally {
            lock.readLock().unlock();
        }
    }

    public void updateConfig(AppConfig newConfig) {
        lock.writeLock().lock();
        try {
            config = newConfig;
        } finally {
            lock.writeLock().unlock();
        }
    }
}

public class ConfigManager {
    public static void main(String[] args) {
        ConfigManagerSer config = new ConfigManagerSer();


        config.updateConfig(new AppConfig(30, 200, true));

        System.out.println(config.getConfig());

        config.updateConfig(new AppConfig(40, 200, false));

        System.out.println(config.getConfig());
    }
}
