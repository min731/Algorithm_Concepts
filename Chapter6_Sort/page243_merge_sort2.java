package Chapter6_Sort;

import java.util.Arrays;

public class page243_merge_sort2 {

    static int[] buff;

    static void merge_sort1(int[] a, int n) {

        // 작업용 배열 buff
        buff = new int[n];

        merge_sort2(a, 0, n - 1);

        buff = null;
    }

    static void merge_sort2(int[] a, int left, int right) {

        if (left < right) {

            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            System.out.print(left + ",");
            System.out.print(center + ",");
            System.out.println(right);

            merge_sort2(a, left, center);
            System.out.println("a :" + Arrays.toString(a));

            System.out.println("---------1----------");
            System.out.print(left + ",");
            System.out.print(center + ",");
            System.out.println(right);

            merge_sort2(a, center + 1, right);
            System.out.println("a :" + Arrays.toString(a));

            System.out.println("---------2----------");
            System.out.print(left + ",");
            System.out.print(center + ",");
            System.out.println(right);

            for (i = left; i <= center; i++) {
                buff[p++] = a[i];

            }

            System.out.println("buff:" + Arrays.toString(buff));

            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            while (j < p) {
                a[k++] = buff[j++];
            }
            System.out.println("a :" + Arrays.toString(a));

        }

    }

    public static void main(String[] args) {

        int[] a = new int[] { 6, 4, 3, 7, 1, 9, 8, 2 };

        merge_sort1(a, a.length);

    }

}
