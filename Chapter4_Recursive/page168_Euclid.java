package Chapter4_Recursive;

public class page168_Euclid {

    // x%y==0 일때 까지
    // 나머지를 나머지로 나눌 수 있으면 최대 공약수

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {

        System.out.println(gcd(11, 22));
        System.out.println(gcd(32,18));

    }
}
