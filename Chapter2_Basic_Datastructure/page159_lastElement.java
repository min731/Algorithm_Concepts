import java.util.Arrays;
import java.util.Scanner;

public class page159_lastElement {

    public static void main(String[] args) {

        // 가장 최근에 입력한 n개의 데이터만 저장하기
        Scanner stdIn = new Scanner(System.in);
        final int N = 5;
        int[] arr = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수 입력:");

        do {
            arr[cnt++ % N] = stdIn.nextInt();
            System.out.println(" 계속? 예:1 / 아니요:0");
            retry = stdIn.nextInt();
        } while (retry == 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));

    }

}
