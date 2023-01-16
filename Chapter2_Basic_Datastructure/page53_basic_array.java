// package Chapter2_Basic_Datastructure;


import java.util.Random;

public class page53_basic_array {
    public static void main(String[] args) {
        
        int [] arr = new int[5];

        System.out.println(arr.length);
        
        arr[0] = 15;
        arr[3] = 13;
        arr[4] = 15;
        
        System.out.println(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i] + ",");
        }
        System.out.println(((Object)arr[2]).getClass()); 
        // * 배열은 자동으로 0값으로 초기화 됌
        // p54 : 자료형별 default value
        // char : null 값으로 초기화
        // boolean : null 값으로 초기화

        int [] arr2;        // 선언하기
        arr2 = new int [5]; // 참조하기


        int [] arr3 = {1,3,5}; //요솟값을 초기화하며 배열 선언

        System.out.println(arr3[0]);

        Random rnd = new Random(); // seed가 없어 고정X
        int rint = rnd.nextInt();
        System.out.println(rint);

        Random rnd2 = new Random(777); // seed가 있어 고정O
        int rint2 = rnd2.nextInt();
        System.out.println(rint2);

        Random rnd3 = new Random(); 
        Boolean rbool = rnd3.nextBoolean(); // nextBoolean, nextDouble 등..
        System.out.println(rbool);

    }
    
}
