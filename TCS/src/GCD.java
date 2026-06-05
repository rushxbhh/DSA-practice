import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.max(a,b);
        int gcd = Integer.MIN_VALUE;
        for (int i = 1 ; i < n; i++ ) {
            if( a % i == 0 & b % i == 0) {
                gcd = Math.max(i, gcd);
            }
        }

        System.out.println(gcd);
    }
}
