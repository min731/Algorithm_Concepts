package Chapter6_Sort;

import java.util.Arrays;

public class page243_merge_sort3 {

    static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    static void sort(int[] arr, int low, int high) {
        if (high - low < 2) {
            return;
        }

        int mid = (low + high) / 2;

        System.out.println("---------1----------");
        System.out.print(low + ",");
        System.out.print(mid + ",");
        System.out.println(high);

        sort(arr, 0, mid);

        System.out.println("---------2----------");
        System.out.print(low + ",");
        System.out.print(mid + ",");
        System.out.println(high);

        sort(arr, mid, high);

        System.out.println("merge");
        System.out.print(low + ",");
        System.out.print(mid + ",");
        System.out.println(high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low];
        int t = 0, l = low, h = mid;

        while (l < mid && h < high) {
            if (arr[l] < arr[h]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[h++];
            }
        }

        while (l < mid) {
            temp[t++] = arr[l++];
        }

        while (h < high) {
            temp[t++] = arr[h++];
        }

        for (int i = low; i < high; i++) {
            arr[i] = temp[i - low];
        }

        System.out.println("arr :" + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] a = new int[] { 6, 4, 7, 1, 8, 2, 5, 13 };

        mergeSort(a);

    }

}
