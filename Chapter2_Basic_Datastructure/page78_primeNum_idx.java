// package Chapter2_Basic_Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class page78_primeNum_idx {

    // 소수구하기
    // 나누는 횟수 줄이기
                                                        
    static void primeNum(){

        // Scanner stdIn = new Scanner(System.in);
        // System.out.println("n 입력:");
        // int n = stdIn.nextInt();

        int counter = 0;
        int [] prime = new int[500];
        int idx = 0;
        prime[idx++] = 2;

        for (int n=3;n<=1000;n+=2){  
            int i;
            for (i=1;i<idx;i++){     
                counter++;
                if (n%prime[i]==0){
                    break;
                }
            }

            if (idx==i){
                prime[idx++] = n;
            }

        }
        System.out.println("총 나눗셈을 한 횟수" + counter);
        System.out.println("prime : " + Arrays.toString(prime));
        
    }


    public static void main(String[] args) {

        primeNum();

    }
    
}
