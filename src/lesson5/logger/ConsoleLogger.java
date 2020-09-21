package lesson5.logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into console: " + "Результат операции равен: " + message);
    }
}