package Chapter1_Basic_Algorithm; // package import 해줘야함

import java.util.Scanner;

// 3 개중 최댓값 찾기
class page13_System_print {

    public static void main(String[]args){

        Scanner stdIn = new Scanner(System.in); // System.in : 표준입력 스트림
                                                // Standard Input Stream

        System.out.println("a값 입력");
        int a = stdIn.nextInt();            // 정수값을 읽어옴. 알파벳,기호 입력 X
                                            // nextBoolean() : True or False
                                            // nextbByte() : -128~127
        System.out.println("b값 입력:");
        int b = stdIn.nextInt();
        System.out.println("c값 입력:");
        int c = stdIn.nextInt();

        int max;

        if (a >= b){
            max = a;
        }
        else{
            max = b;
        }

        if (max < c){
            max = c;
        }

        System.out.println("max 값:" + max);


    }

}