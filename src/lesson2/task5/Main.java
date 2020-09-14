package lesson2.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число:");

            for (String line = bufferedReader.readLine(); true; line = bufferedReader.readLine()) {
                numbers.add(Integer.parseInt(line));
            }

        } catch (NumberFormatException e) {
            if (e.getMessage().equals("For input string: \"\"")) {
                System.out.println("Выполнено нажатие на Enter. Производим рассчёт...");
            } else {
                System.out.println("Допустимо вводить только цифры!");
            }
        }

        int min = numbers.get(0);
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Наименьшее из введённых цифр: " + min);
    }
}