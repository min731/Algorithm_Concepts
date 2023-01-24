package Chapter4_Recursive;

class recurMemo{

    static String[] memo;

    // memoization으로 재귀함수 만들기
    static void recur(int n){
        if(memo[n+1]!=null){
            System.out.println(memo[n+1]);
        }
        else{
            if(n>0){
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n" +memo[n-1];
            }
            else{
                memo[n+1]="";
            }
        }
    }
}

public class page177_memoization {

    public static void main(String[] args) {
        
        memo = new String[5+2];
        re
    }
}
