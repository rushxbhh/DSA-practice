import java.util.Scanner;

public class PrimeFac {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {

            // check if i is factor of n
            if (n % i == 0) {

                boolean isPrime = true;

                // check whether i is prime
                for (int j = i - 1; j > 1; j--) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // print only if prime
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}