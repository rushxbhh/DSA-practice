import java.util.Scanner;

public class Factorial {
    public static void main(String[] cs){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        if(n == 0)  System.out.println(res);
        while (n != 0) {
            res = res * n;
            n--;
        }

        System.out.println(res);
    }
}
