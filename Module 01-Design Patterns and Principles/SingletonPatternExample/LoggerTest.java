public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("App Started.");

        String dateTime = logger.getCurrentDateTime();
        logger.log(dateTime);

        String greet = logger.getWelcomeMessage("Abhiram");
        logger.log(greet);

        String info = logger.getSystemInfo();
        logger.log(info);
    }
}
