package lesson2.task10;

public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        moveZeroToTheEnd(arr);

        for (int i : arr) {
            System.out.print(i + ";");
        }

    }

    public static void moveZeroToTheEnd(int[] arr) {

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }

        while (i < arr.length) {
            arr[i++] = 0;
        }

    }
}