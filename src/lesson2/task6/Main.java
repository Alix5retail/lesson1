package lesson2.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите число:");
            int inputNumber = Integer.parseInt(bufferedReader.readLine());

            if (inputNumber > 0) {
                if (inputNumber % 2 == 0) {
                    System.out.println("Число положительное и четное: " + inputNumber);
                } else {
                    System.out.println("Число положительное и нечетное: " + inputNumber);
                }
            } else if (inputNumber < 0) {
                if (inputNumber % 2 == 0) {
                    System.out.println("Число отрицательное и четное: " + inputNumber);
                } else {
                    System.out.println("Число отрицательное и нечетное: " + inputNumber);
                }
            } else {
                System.out.println("Число нулевое: " + inputNumber);
            }

        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}