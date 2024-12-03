package creational;

// Singleton Class
public class Configuration {
    // Static variable to hold single instance
    private static Configuration instance;

    // Private constructor to prevent instantiation
    private Configuration() {
        System.out.println("Loading configuration...");
    }

    // Public method to provide access to the instance
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    // Example method
    public void showSettings() {
        System.out.println("Displaying settings...");
    }
}
