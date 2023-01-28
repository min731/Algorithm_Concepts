package Chapter6_Sort;

import java.util.Arrays;

public class page213_Straight_Insertion_Sort {

    static void insert_sort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                for (int j = 0; j <= i - 1; j++) {
                    if (arr[i] < arr[j]) {
                        swap(arr, i, j);
                        System.out.println(Arrays.toString(arr));
                    }
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 4, 1, 7, 3, 9, 8 };

        System.out.println(Arrays.toString(arr));
        insert_sort(arr, arr.length);

    }
}
