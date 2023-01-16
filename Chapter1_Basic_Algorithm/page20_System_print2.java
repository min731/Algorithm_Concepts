package Chapter1_Basic_Algorithm;

import java.util.Scanner;

public class page20_System_print2 {
    
    static int median_3(){

        Scanner stdIn = new Scanner(System.in);

        System.out.println("a값 입력:");
        int a = stdIn.nextInt();
        System.out.println("b값 입력:");
        int b = stdIn.nextInt();
        System.out.println("c값 입력:");
        int c = stdIn.nextInt();

        int med = a;

        if (a>=b){
            if (b>=c){
                med = b;
            }
            else if(c >=a){
                med = a;
            }
            else{
                med = c;
            }
        }
        else{
            if (a>=c){
                med = a;

            }
            else if (c>=b){
                med = b;
            }
            else{
                med = c;
            }
        }
        

        
        return med;
    }



    // main 작성하면 main 메서드 자동완성
    public static void main(String[] args) {
        
        median_3();

    }
}
