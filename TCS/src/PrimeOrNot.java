import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         boolean isPrime = true;
        int n = sc.nextInt();
        if (n == 1) System.out.println(false);
      else {
            for (int i = n - 1; i > 1; i--) {
                if (n % i == 0) isPrime = false;
                break;
            }
            System.out.println(isPrime);
        }
    }
}
