package lesson2.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите код города:");
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Укажите кол-во минут:");
            int minutes = Integer.parseInt(bufferedReader.readLine());
            double moscow = 4.15;
            double rostov = 1.98;
            double krasnodar = 2.69;
            double kirov = 5.00;

            switch (inputNumber) {
                case (905) -> System.out.println("Москва. Стоимость разговора: " + moscow * minutes);
                case (194) -> System.out.println("Ростов. Стоимость разговора: " + rostov * minutes);
                case (491) -> System.out.println("Краснодар. Стоимость разговора: " + krasnodar * minutes);
                case (800) -> System.out.println("Киров. Стоимость разговора: " + kirov * minutes);
                default -> System.out.println("Не найдено совпадений.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}