// package Chapter2_Basic_Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class page76_primeNum {

    // 소수구하기
    // 나누는 횟수 줄이기
                                                        
    static void primeNum(){

        // Scanner stdIn = new Scanner(System.in);
        // System.out.println("n 입력:");
        // int n = stdIn.nextInt();

        int counter = 0;
        int [] prime = new int[1000];
        int idx = 0;
        prime[idx++] = 2;

        for (int n=2;n<=1000;n++){  // n: 2~1000
            int i =0;
            for (i=2;i<n;i++){     // i: 2~n-1
                counter++;
                if (n%i==0){
                    System.out.println(n + "는 소수가 아닙니다.");
                    break;
                }
                if (i==n-1){
                    prime[idx++] = n;
                }
            }

        }
        System.out.println("총 나눗셈을 한 횟수" + counter);
        System.out.println("prime : " + Arrays.toString(prime));
        
    }


    public static void main(String[] args) {

        primeNum();

    }
    
}
