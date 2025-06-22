// File: Logger.java
public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make constructor private
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Only one instance will be created
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
