package lesson5.logger;

public class DbLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into database: " + "Результат операции равен: " + message);
    }
}