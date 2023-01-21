import java.util.Arrays;

public class page116_binarySearch {
    

    // 이진검색 라이브러리가 있음
    public static void main(String[] args) { 

        String [] arr = new String[]{"임","정","민","짱","!"};
        
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, "짱"));
        
        System.out.println(Arrays.binarySearch(arr, "엥"));

    }
}
