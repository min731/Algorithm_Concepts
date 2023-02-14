package Chapter6_Sort;

import java.util.Arrays;

public class page243_merge_sort {

    static void merge(int[] a, int na, int[] b, int nb, int[] c) {

        int pa = 0;
        int pb = 0;
        int pc = 0;

        while (pa < na && pb < nb) {
            c[pc++] = a[pa] <= b[pb] ? a[pa++] : b[pb++];
            System.out.println(Arrays.toString(c));
        }

        while (pa < na) {
            c[pc++] = a[pa++];
            System.out.println("a 배열");
            System.out.println(Arrays.toString(c));
        }

        while (pb < nb) {
            c[pc++] = b[pb++];
            System.out.println("b 배열");
            System.out.println(Arrays.toString(c));
        }

    }

    public static void main(String[] args) {

        int a[] = { 2, 4, 6, 8, 11, 13 };
        int b[] = { 1, 2, 3, 4, 9, 16, 21 };
        int c[] = new int[13];

        merge(a, a.length, b, b.length, c);

    }

}
