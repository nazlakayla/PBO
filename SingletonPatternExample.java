package creational;

// Main Class
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Try to get the Configuration instance
        Configuration config1 = Configuration.getInstance();
        config1.showSettings();

        // Try to get the instance again
        Configuration config2 = Configuration.getInstance();
        config2.showSettings();

        // Check if both instances are the same
        System.out.println("config1 == config2: " + (config1 == config2));
    }
}
