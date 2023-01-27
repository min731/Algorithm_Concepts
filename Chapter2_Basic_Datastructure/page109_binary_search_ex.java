import java.util.Arrays;

public class page109_binary_search_ex {

    static int binarySearch(int [] arr, int key){
        
        int low = 0;
        int high = arr.length-1;
        int mid = (high+low)/2;

        while(arr[mid]!=key){
            mid = (high+low)/2;
            System.out.println("low: "+low+" mid: "+mid+" high: "+high);
            if (key<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }


        return mid;
    }

    public static void main(String[] args) {
        
        int [] arr1 = new int []{7,2,4,23,18,5,13,33};
        int [] arr2 = new int []{7,3,2,4,23,18,5,13,33};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(binarySearch(arr1, 13));
        System.out.println(binarySearch(arr2, 13));

    }
    
}
