package uk.co.hexeption.api.io;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Hexeption on 16/01/2017.
 */
public final class LoggerHelper {

    private static Logger logger = LogManager.getLogger();

    private static void log(Level level, Object message) {

        logger.log(level, message);
    }

    /**
     * No events will be logged.
     *
     * @param message
     */
    public static void off(Object message) {

        log(Level.OFF, message);
    }

    /**
     * A severe error that will prevent the application from continuing.
     *
     * @param message
     */
    public static void fatal(Object message) {

        log(Level.FATAL, message);
    }

    /**
     * An error in the application, possibly recoverable.
     *
     * @param message
     */
    public static void error(Object message) {

        log(Level.ERROR, message);
    }

    /**
     * An event that might possible lead to an error.
     *
     * @param message
     */
    public static void warn(Object message) {

        log(Level.WARN, message);
    }

    /**
     * An event for informational purposes.
     *
     * @param message
     */
    public static void info(Object message) {

        log(Level.INFO, message);
    }

    /**
     * A general debugging event.
     *
     * @param message
     */
    public static void debug(Object message) {

        log(Level.DEBUG, message);
    }

    /**
     * A fine-grained debug message, typically capturing the flow through the application.
     *
     * @param message
     */
    public static void tace(Object message) {

        log(Level.TRACE, message);
    }

    /**
     * All events should be logged.
     *
     * @param message
     */
    public static void all(Object message) {

        log(Level.ALL, message);
    }

}
