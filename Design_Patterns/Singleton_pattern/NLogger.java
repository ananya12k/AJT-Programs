package Singleton_pattern;

public class NLogger {
    private NLogger() {
    }

    // Static inner class to hold the Singleton instance
    /*
     * You can technically use a public static inner class to hold the Singleton
     * instance, but it's not a recommended practice for implementing the Bill Pugh
     * Singleton pattern. The reason for this is to maintain encapsulation and
     * prevent direct access to the myLog field from outside the class.
     */
    private static class SingletonHelper {
        // The Singleton instance is created inside the inner class
        private static final NLogger myLog = new NLogger();
    }

    // Public method to get the singleton instance
    public static NLogger getInstance() {
        // When this method is called, it indirectly references the inner class,
        // which initializes the Singleton instance if it hasn't been created yet.
        return SingletonHelper.myLog;
    }

    // Log method
    public void log(String message) {
        // Logic to log the message goes here
        System.out.println("Logging: " + message);
    }
}
