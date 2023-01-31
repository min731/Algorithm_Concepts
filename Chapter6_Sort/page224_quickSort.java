package Chapter6_Sort;

import java.util.Arrays;

public class page224_quickSort {

    static void partition(int [] arr,int n){
        int low = 0;
        int high = n-1;
        int x = arr[n/2]; // x는 피봇
        
        while(low<=high){

            while(arr[low]<x){
                low++;
            }

            while(arr[high]>x){
                high--;
            }
            // System.out.println("low: "+low +"high: "+high);
            if(low<=high){
                // 메서드 다 끝나고 ++
                swap(arr, low++, high--);
            }
            // System.out.println("low: "+low +"high: "+high);
            System.out.println(Arrays.toString(arr));
        }

    }

    static void swap(int [] arr,int front, int rear){
        // System.out.println("low: "+front +"high: "+rear);
        int temp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = temp;
    }

    public static void main(String[] args) {
        
        ///                      크기 9
        int [] arr = new int [] {5,8,4,2,6,1,3,9,7};
        // int [] arr = new int [] {1,8,7,4,5,2,6,3,9};
        partition(arr, arr.length);
    }
    
}
