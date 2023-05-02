package Chapter6_Sort;

import java.util.Scanner;

class page264_heapsort{

    static void swap(int[] arr, int idx1, int idx2){

        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }


    //                          배열, 가장 우측 하단 부모 인덱스부터 ,최대인덱스
    static void downHeap(int [] arr, int left, int right){

        // temp = 원래 부모의 값
        int temp = arr[left];
        int child;
        int parent;

        for (parent = left; parent < ( right + 1 ) / 2; parent = child){
            // 왼쪽 자식 인덱스
            int cl = parent * 2 +1;
            // 오른쪽 자식 인덱스
            int cr = cl + 1;

            child = (cr <= right && arr[cr] > arr[cl]) ? cr : cl;
            if (temp >= arr[child]){
                break;
            }
            arr[parent] = arr[child];
        }
        System.out.println("바뀐 parent 값 : " +  parent);
        arr[parent] = temp;
    }

    //                          배열, 크기
    static void heapSort(int [] arr, int n ){
        
        // 1. heap 만들기
        // i는 배열 크기에서 반잘라서 --1씩
        for (int i = ( n-1 )/2; i>= 0 ; i--){
            //      배열, i=가장 우측 하단 부모 인덱스부터 ,최대인덱스
            System.out.println("부모 인덱스 : " + i);
            downHeap(arr, i, n-1);
        }
        
        // 2. 최대인덱스 부터 정렬, heap 만들기 반복
        for (int i = n-1; i>0;i--){
            // 최소 인덱스 <-> 최대 인덱스
            swap(arr, 0, i);
            downHeap(arr, 0, i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수: ");

        // nx = arr 크기
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        // heapsort(배열,크기)
        heapSort(x, nx);    // 배열 x를 힙정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
    
}
