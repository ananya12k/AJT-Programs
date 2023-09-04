package Singleton_pattern;

public class Bill_Pugh_Singleton {
    
    public static void main(String[] args) {
        NLogger mLogger = NLogger.getInstance();
        NLogger logger = NLogger.getInstance();
        mLogger.log("mLogger " + mLogger);
        logger.log("mLogger " + logger);
    }
    
}
