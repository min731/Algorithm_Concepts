package Chapter6_Sort;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class page270_countingSort {

    static int [] countingSort(int [] arr, int len, int max){
        
        // 누적도수
        int [] f = new int[max+1];
        // 작업용 목표 배열
        int [] b = new int[len+1];
    
        // 도수분포표
        for (int i=0; i<len; i++) f[arr[i]]++;
        
        System.out.println("-------------누적도수분포표-------------");
        // 누적도수분포표
        for (int i=1;i<=max;i++){
            f[i] += f[i-1];
            System.out.println(Arrays.toString(f));
        }
        System.out.println("-------------목표배열-------------");
        // 목표 배열
        for (int i=len-1;i>=0;i--){
            System.out.println("원래 f[arr[i]] 는 " + f[arr[i]]);

            // * -- 연산자 : 참조한 객체의 값을 -1함
            b[--f[arr[i]]] = arr[i];
            int temp = f[arr[i]];
            System.out.println("i 는 " + i);
            System.out.println("arr[i] 는 " + arr[i]);
            System.out.println("f[arr[i]] 는 " + (temp));
            System.out.println(Arrays.toString(b));
            System.out.println("--------------");
        }
        //최종 배열
        for (int i=0;i<len;i++) arr[i] = b[i];

        return arr;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 배열 예시
        int [] arr = new int []{5,3,5,5,6};

        // 최댓값 구하기
        int max = arr[0];
        int len = arr.length;
        for (int i=1; i<len;i++)
        if (arr[i] > max) max =arr[i];

        arr = countingSort(arr,len,max);

        bw.write(Arrays.toString(arr));
        bw.flush();


    }
}
