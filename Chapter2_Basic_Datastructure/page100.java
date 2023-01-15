import java.util.Scanner;

public class page100 {

    static int Search(int []arr,int num){

        for (int i=0; i<arr.length;i++){
            if (arr[i]==num){
                return i;
            }
            if (i==arr.length-1){
                return -1;
            }
        }
        
        return 0;

    }

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        System.out.println("배열의 크기 입력: ");
        int n = stdIn.nextInt();
        int arr [] = new int [n];
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
