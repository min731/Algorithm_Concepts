package Chapter1_Basic_Algorithm;

import java.util.Scanner;

public class page28_while {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("n을 입력하시오:");
        int n = stdIn.nextInt();
        int sum = 0;

        // 하나의 변수만 사용하는 반복문은 for
        // 아니면 while

        
        for (int i = 1; i<n+1; i++){
            //초기화;제어식;업데이트부분
            sum += i;
        }

        System.out.println("n까지 합계는 : " + sum);


    }
    
}
