package src.calculator.logging;


import java.time.LocalDateTime;

public class Logger {
    public void log(String message) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedMessage = "[" + currentDateTime + "] " + message;
        System.out.println(formattedMessage);
    }
}
