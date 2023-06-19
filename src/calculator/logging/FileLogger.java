package src.calculator.logging;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements ILogger {
    private final String logFilePath;

    public FileLogger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    @Override
    public void log(String message) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedMessage = "[" + currentDateTime + "] " + message;

        try (FileWriter fileWriter = new FileWriter(logFilePath, true)) {
            fileWriter.write(formattedMessage + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
