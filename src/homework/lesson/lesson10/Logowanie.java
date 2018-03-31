package homework.lesson.lesson10;

import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logowanie {
    @Test
    public void LoggerTest_01() {
        Logger
                .getAnonymousLogger()
                .log(
                        Level.INFO,
                        "to jest w logu");
    }

    @Test
    public void LoggerTest_02() {
        Logger myLogger = Logger.getLogger(Logowanie.class.getName());

        myLogger.log(Level.INFO, "to jest w logu");
        myLogger.log(Level.INFO, "to też jest w logu");
    }

    static private Logger logger = Logger.getLogger(Logowanie.class.getName());

    @Test
    public void LoggerTest_03() {
        logger.log(Level.INFO, "to jest w logu");
        logger.log(Level.INFO, "to też jest w logu");
    }

}