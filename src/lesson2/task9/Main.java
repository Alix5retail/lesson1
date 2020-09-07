package lesson2.task9;

public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        reverse(arr);

        for (int i : arr) {
            System.out.print(i + ";");
        }

    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}