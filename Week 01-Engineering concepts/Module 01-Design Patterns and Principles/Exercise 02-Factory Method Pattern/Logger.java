import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static volatile Logger instance;
    private String prefix;

    private Logger() {
        prefix = "[AppLog] ";
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(prefix + message);
    }

    public String getCurrentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "📅 " + dtf.format(LocalDateTime.now());
    }

    public String getWelcomeMessage(String userName) {
        return "👋 Welcome, " + userName + "! Hope you're having a great day.";
    }

    public String getSystemInfo() {
        return "🖥️ OS: Java Runtime " + System.getProperty("java.version");
    }
}
