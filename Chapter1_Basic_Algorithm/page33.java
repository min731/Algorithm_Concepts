package Chapter1_Basic_Algorithm;

import java.util.Scanner;

public class page33 {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        int n;

        // 사전판단반복문 : while, for
        // 사후판단반복문 : do while (한번은 반드시 실행함)

        do{

            System.out.println("양수 n을 입력:");
            n = stdIn.nextInt();

        }while(n <= 0);

        for (int i=n;i>0;i--){
            
            sum +=i;

        }

        System.out.println("n까지 합계" + sum);

    }
    
}
