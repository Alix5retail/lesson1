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
            int smallest;

            if (a <= b && a <= c) {
                smallest = a;
            } else if (b <= a && b <= c) {
                smallest = b;
            } else {
                smallest = c;
            }
            System.out.println("Наименьшее из введённых цифр: " + smallest);

        } catch (NumberFormatException e) {
            System.out.println("Допустимо вводить только цифры!");
        }
    }
}