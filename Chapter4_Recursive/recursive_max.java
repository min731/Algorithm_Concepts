package Chapter4_Recursive;

public class recursive_max {
    public static void main(String[] args) {
        // 배열의 최대값을 가져온다
        int arr[] = { 0, 80, 60, 40, 20, 100 };
        System.out.println(ArraySort(arr, 2));
    }

    // 크기가 N인 경우 최대값을 가져오는 메서드 선언
    public static int ArraySort(int[] a, int n) {
        int x;
        if (n == 1)
            return a[0];
        else
            x = ArraySort(a, n - 1);
        // x = ArraySort(a, 1); n=2
        // x = ArraySort(a, 0); n=1
        // x = 0
        System.out.println(n - 1);
        System.out.println(x);
        if (x > a[n - 1])
            return x;
        else
            return a[n - 1];
    }
}