package Chapter6_Sort;

import java.util.Arrays;

public class page230_quickSort_recur {

    static void quickSort(int [] arr, int left, int right){
        int low = left;
        int high = right;
        int x = arr[(high+low)/2];

        while(low<=high){

            while(arr[low]<x){
                low++;
            }

            while(x<arr[high]){
                high--;
            }

            if(low<=high){
                swap(arr, low++, high--);
            }
            System.out.println(Arrays.toString(arr));
        }

        if(left<low){
            quickSort(arr, left, high);
        }
        if(high<right){
            quickSort(arr,low, right);
        }

    }

    static void swap(int [] arr,int front , int rear){
        int temp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = temp;
    }

    public static void main(String[] args) {

        int [] arr = new int [] {5,8,4,2,6,1,3,9,7};
        quickSort(arr, 0, arr.length-1);
        
    }
    
}
