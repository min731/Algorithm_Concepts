import java.util.Arrays;

public class page81 {

    public static void main(String[] args) {
        
        int counter = 0;
        int idx = 0;
        int [] prime = new int[500];

        prime[idx++] = 2;
        prime[idx++] = 3;
        System.out.println(Arrays.toString(prime));

        for(int n=5; n<=1000;n+=2){
            boolean flag = false;

            for (int i=1; prime[i]*prime[i]<=n;i++){
                counter +=2;

                if (n % prime[i]==0){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                prime[idx++] = n;
                counter++;
            }
        }

        System.out.println("곱셈,나눗셈 횟수: " + counter);
        System.out.println(Arrays.toString(prime));

        int [] prime2 = prime.clone();          // 배열 복제
        System.out.println(Arrays.toString(prime2));
    }
    
}
