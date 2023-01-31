package Chapter6_Sort;

import java.util.Arrays;

public class page239_quickSort_sort3elem {

    static void quickSort(int [] arr, int left, int right){
        
        int low = left;
        int high = right;
        int m = sort3elem(arr, low, (high+low)/2, high);
        int x = arr[m];

        swap(arr, m, right-1);

        low++;
        high-=2;

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

        if(left<high){
            quickSort(arr, left, high);
        }
        if(low<right){
            quickSort(arr, low,right);
        }


    }

    static int sort3elem(int [] arr, int a, int b,int c){
        if(arr[b]<arr[a]){
            swap(arr, b, a);
        }
        if(arr[b]>arr[c]){
            swap(arr, b, c);
        }
        if(arr[b]>arr[a]){
            swap(arr, b, a);
        }

        return b;

    }

    static void swap(int [] arr, int front, int rear){
        int tmp = arr[front];
        arr[front] = arr[rear];
        arr[rear] = tmp;
    }

    public static void main(String[] args) {
        int [] arr = new int [] {2,5,4,7,1,8,3,6,9};
        quickSort(arr, 0, arr.length-1);
    }
}
