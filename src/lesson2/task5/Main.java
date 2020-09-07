package lesson2.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите число:");
            int a = Integer.parseInt(bufferedReader.readLine());
            int b = Integer.parseInt(bufferedReader.readLine());
            int c = Integer.parseInt(bufferedReader.readLine());
            int[] numbers = {a, b, c};
            int min = numbers[0];

            for (int n : numbers) {
                min = Math.min(min, n);
            }
            System.out.println("Наименьшее из введённых цифр: " + min);
        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}