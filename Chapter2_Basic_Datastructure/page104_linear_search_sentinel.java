// package Chapter2_Basic_Datastructure;

import java.util.Scanner;

public class page104_linear_search_sentinel {

    // 보초법
    // 맨끝 인덱스에 찾고자하는 요소 추가
    // 배열 총 길이에 대한 판단 if문 제거

    static int Search(int []arr,int num){

        arr[arr.length-1] = num;

        for (int i=0; i<arr.length;i++){
            if (arr[i]==num){
                return i == arr.length-1 ? -1 : i;
            }
        }
        
        return 0;

    }

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열의 크기 입력: ");
        int n = stdIn.nextInt();

        // arr 에 배열크기 + 1
        int arr [] = new int [n+1];
        int el;

        for (int i=0;i<n;i++){
            el = stdIn.nextInt();
            arr[i] = el;
        }

        System.out.println("찾고자 하는 수: ");
        int num = stdIn.nextInt();

        System.out.println(Search(arr, num));

    }
    
}
