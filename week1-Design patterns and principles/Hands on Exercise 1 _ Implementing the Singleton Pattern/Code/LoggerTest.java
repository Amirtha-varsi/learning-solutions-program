// File: LoggerTest.java
public class LoggerTest {
    public static void main(String[] args) {
        // Get first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Test: Are both instances the same?
        if (logger1 == logger2) {
            System.out.println("Only one instance exists. Singleton is working.");
        } else {
            System.out.println("Different instances. Singleton failed.");
        }
    }
}
