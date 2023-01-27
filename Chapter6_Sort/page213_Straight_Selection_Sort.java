package Chapter6_Sort;

import java.util.Arrays;

public class page213_Straight_Selection_Sort {

    static void selctionSort(int [] arr,int n){

        int max = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("최댓값: "+ max);
        for(int i=0;i<n;i++){
            int min = max;
            int now_min = 0;
            System.out.println(i + "번째");
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    System.out.println("min 변경"+arr[j]);
                    now_min = arr[j];
                }
            }
            arr[i] = now_min;
        }
        
    }

    static void swap(int [] arr,int a, int b){
        
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = arr[a];

    }

    public static void main(String[] args) {

        int [] arr = new int [] {3,4,2,3,1};

        System.out.println(Arrays.toString(arr));

        selctionSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
        
    }
    
}
