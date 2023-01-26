package Chapter6_Sort;

import java.util.Arrays;

class BubbleSort {

    static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }

    }

    static void swap(int[] arr, int front, int rear) {
        int temp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = temp;
    }

}

public class page204_bubble1 {

    public static void main(String[] args) {

        int[] arr = new int[] { 5, 8, 22, 14, 7, 33, 2, 5 };

        System.out.println(Arrays.toString(arr));

        BubbleSort.bubble_sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

}
