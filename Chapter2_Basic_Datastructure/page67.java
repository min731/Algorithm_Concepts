package Chapter2_Basic_Datastructure;

import java.util.Arrays;

//배열의 요소 역순으로 바꾸기
public class page67 {

    static void swap(int arr[],int idx, int idx2){

        int t = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = t;
    }

    static void reverse(int arr[]){
        for (int i=0;i<arr.length/2;i++){
            swap(arr, i, arr.length-i-1);   
        }

    }

    public static void main(String[] args) {
     
        int arr [] = {2,5,1,3,9,6,7};

        reverse(arr);

        System.out.println("배열의 요소 전체 출력" + Arrays.toString(arr));
    }
    
}
