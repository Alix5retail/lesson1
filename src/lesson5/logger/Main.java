package lesson5.logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger logger = null;
        LoggerFactory factory = null;
        LogType type = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой тип логирование использовать?");

        try {
            type = LogType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа логирования");
            System.exit(0);
        }

        switch (type) {
            case Console:
                factory = new ConsoleFactory();
                break;
            case Db:
                factory = new DbFactory();
                break;
            case File:
                factory = new FileFactory();
                break;
            default:
        }

        if (factory != null) {
            logger = factory.createLogger();
        }

        double a, b;
        System.out.print("Введите первое число: \n");
        a = sc.nextDouble();
        System.out.print("Введите второе число:  \n");
        b = sc.nextDouble();
        System.out.print("Выберите операцию  " +
                "\n1.Сложение" +
                "\n2.Вычетание" +
                "\n3.Умножение" +
                "\n4.Деление" +
                "\n#Введите номер операции: \n");

        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                logger.log(calculator.addition(a, b));
                break;
            case 2:
                logger.log(calculator.subtraction(a, b));
                break;
            case 3:
                logger.log(calculator.multiplication(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    logger.log(calculator.division(a, b));
                }
                break;
            default:
                System.out.println("Опепация не найдена");
                break;
        }
    }
}