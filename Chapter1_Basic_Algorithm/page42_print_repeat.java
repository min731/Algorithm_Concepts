package Chapter1_Basic_Algorithm;

import java.util.Scanner;

public class page42_print_repeat {

    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        int n,w;

        do{
            System.out.println("양수 n 입력");
            n = stdIn.nextInt();
        }while(n<0); // n = 0,1,2,3..

        do{
            System.out.println("한 줄의 *갯수 w 입력:");
            w = stdIn.nextInt();
        }while(w<0); // w = 1,2,3...

        for (int i=0;i<n/w;i++){
            System.out.println("*".repeat(w));
        }
        
        System.out.println("*".repeat(n%w));


    }
    
}
