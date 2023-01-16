public class page109_binary_search2 {

    static int binSearch2(int [] arr,int n,int key){ // (배열,배열크기,찾고 싶은 수)

        int pl = 0;   // 검색할 범위의 첫 인덱스
        int pr = n-1; // 검색할 범위의 끝 인덱스

        do{
            int pc = (pl+pr) /2;
            if (arr[pc]==key){
                return pc;
            }
            else if (arr[pc] < key){
                pl = pc +1;
            }
            else{ // (key < arr[pc])
                pr = pc-1;
            }
        }while(pl<=pr);

        return -1;
    }

    public static void main(String[] args) {
        
        int arr [] = {15,27,39,77,92,108,121};

        System.out.println(binSearch2(arr, arr.length, 15));
        System.out.println(binSearch2(arr, arr.length, 27));
        System.out.println(binSearch2(arr, arr.length, 39));
        System.out.println(binSearch2(arr, arr.length, 77));
        System.out.println(binSearch2(arr, arr.length, 92));
        System.out.println(binSearch2(arr, arr.length, 108));
        System.out.println(binSearch2(arr, arr.length, 121));
        System.out.println(binSearch2(arr, arr.length, 99));

    }
    
}
