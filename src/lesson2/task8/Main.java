package lesson2.task8;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int sumOfPositiveNumbers = 0;
        int countOfPositiveNumbers = 0;
        int sumOfEvenNegativeNumbers = 0;
        double sumOfNegativeNumbers = 0;
        int countOfNegativeNumbers = 0;

        Integer[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        for (Integer integer : arr) {
            if (integer > 0) {
                sumOfPositiveNumbers += integer;
                countOfPositiveNumbers++;
            } else if (integer < 0) {
                sumOfNegativeNumbers += integer;
                countOfNegativeNumbers++;
                if (integer % 2 == 0) {
                    sumOfEvenNegativeNumbers += integer;
                }
            }
        }

        System.out.println("Максимальное значение: " + Collections.max(Arrays.asList(arr)));
        System.out.println("Сумма положительных элементов равна: " + sumOfPositiveNumbers);
        System.out.println("Количество положительных элементов равна: " + countOfPositiveNumbers);
        System.out.println("Сумма чётных отрицательных элементов равна: " + sumOfEvenNegativeNumbers);
        System.out.println("Среднее арифметическое отрицательных элементов равна: " + sumOfNegativeNumbers / countOfNegativeNumbers);

    }
}