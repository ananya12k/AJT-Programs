package Singleton_pattern;

/**
 * Singleton
 */
public class Singleton {

    public static void main(String[] args) {
        Logger mLogger = Logger.getLogger();
        Logger logger = Logger.getLogger();
        mLogger.log("mLogger " + mLogger);
        logger.log("mLogger " + logger);
    }
}