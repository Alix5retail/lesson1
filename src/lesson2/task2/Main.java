package lesson2.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите число:");
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            int sum = 0;

            for (; inputNumber > 0; inputNumber /= 10 ){
                sum += inputNumber % 10;
            }
            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}