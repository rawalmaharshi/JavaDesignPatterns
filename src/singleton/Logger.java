package singleton;

//Singleton pattern ensures that only one object of the class is created
public class Logger {

    //Static since, its being called by a static method getInstance()
    private static Logger logger;

    //necessary to make the constructor private for singleton pattern
    private Logger() {

    }

    //static since, we do not want to initialize an object; we want to use this function without initializing an object
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }
}
