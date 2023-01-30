package Chapter6_Sort;

import java.util.Arrays;

public class page220_shell {

    static void shellSort(int [] arr, int n){
        for(int h=n/2;h>0;h/=2){
            for(int i=h;i<n;i++){
                int j;
                int tmp = arr[i];
                for(j=i-h;j>=0 && arr[j]>tmp;j-=h){
                    arr[j+h] = arr[j];
                }
                arr[j+h] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        
        int [] arr = new int []{6,4,3,7,9,8};

        shellSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}
