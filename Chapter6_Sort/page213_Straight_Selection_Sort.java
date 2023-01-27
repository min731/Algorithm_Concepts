package Chapter6_Sort;

import java.util.Arrays;

public class page213_Straight_Selection_Sort {

    static void selctionSort(Integer[] arr, int n) {

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최댓값: " + max);

        for (int i = 0; i < n - 1; i++) {
            int min = max;
            for (int j = i; j < n; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                }
            }

            System.out.println("정렬 전: " + Arrays.toString(arr));
            System.out.println(i + 1 + "번째 최솟값: " + min);

            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[Arrays.asList(arr).indexOf(min)]) {
                    System.out.println("최솟값의 인덱스: " + j);
                    System.out.println(Arrays.asList(arr).indexOf(min) + " <-> " + i);
                    swap(arr, j, i);
                    break;
                }
            }
            swap(arr, Arrays.asList(arr).indexOf(min), i);
            System.out.println("정렬 후: " + Arrays.toString(arr));
            System.out.println("--------------");
        }

    }

    static void swap(Integer[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {

        Integer[] arr = { 3, 4, 2, 3, 1 };

        System.out.println(Arrays.toString(arr));

        selctionSort(arr, arr.length);

    }

}
