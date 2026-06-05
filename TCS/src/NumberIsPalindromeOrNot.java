import java.util.*;

public class NumberIsPalindromeOrNot {
    public static void main(String[] tcs){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int dig;
        int org = n;
        while(n != 0) {
            dig = n % 10;
            reverse = reverse * 10 + dig;
            n /= 10;
        }
        System.out.println(reverse == org);
    }
}
