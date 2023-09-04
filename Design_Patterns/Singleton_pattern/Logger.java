package Singleton_pattern;

// Lazy Intitialization

public class Logger {
    public static Logger myLog;

    private Logger() {
    }

    public static Logger getLogger() {
        if (myLog == null) {
            myLog = new Logger();

        }
        return myLog;
    }

    public void log(String s) {
        System.err.println(s);
    }
}
