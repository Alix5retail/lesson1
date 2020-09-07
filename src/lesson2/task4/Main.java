package lesson2.task4;

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
                inputNumber++;
            } else if (inputNumber < 0) {
                inputNumber = inputNumber - 2;
            } else {
                inputNumber = 10;
            }
            System.out.println(inputNumber);
        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}