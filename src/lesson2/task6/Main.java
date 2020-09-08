package lesson2.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean isNumberEven = false;
    public static boolean isNumberPositive = false;
    public static boolean isNumberNegative = false;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Введите число:");
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            checkIsNumberEven(inputNumber);
            checkIsNumberPositive(inputNumber);

            if (isNumberPositive && isNumberEven) {
                System.out.println("Число положительное и четное: " + inputNumber);
            } else if (isNumberPositive) {
                System.out.println("Число положительное и нечетное: " + inputNumber);
            } else if (isNumberNegative && isNumberEven) {
                System.out.println("Число отрицательное и четное: " + inputNumber);
            } else if (isNumberNegative) {
                System.out.println("Число отрицательное и нечетное: " + inputNumber);
            } else {
                System.out.println("Число нулевое: " + inputNumber);
            }

        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }

    static void checkIsNumberEven(int n) {
        if (n % 2 == 0) {
            isNumberEven = true;
        }
    }

    static void checkIsNumberPositive(int n) {
        if (n > 0) {
            isNumberPositive = true;
        } else if (n < 0) {
            isNumberNegative = true;
        }
    }
}