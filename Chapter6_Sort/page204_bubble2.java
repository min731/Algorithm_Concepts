package Chapter6_Sort;

import java.util.Arrays;

class BubbleSort {

    static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int check = 0;
            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    check++;
                }
            }
            if (check == 0) {
                System.out.println((i + 1) + "번째 패쓰에서 부터 정렬 생략 가능");
                break;
            }
        }

    }

    static void swap(int[] arr, int front, int rear) {
        System.out.println("swap 실행");
        int temp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = temp;
    }

}

public class page204_bubble2 {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 3, 4, 6, 5, 8, 9 };

        System.out.println(Arrays.toString(arr));

        BubbleSort.bubble_sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));

    }

}
