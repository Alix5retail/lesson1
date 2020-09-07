package lesson2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите число:");
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Последняя цифра введённого числа равна: " + inputNumber % 10);
        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}