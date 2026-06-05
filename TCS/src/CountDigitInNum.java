import java.util.Scanner;

public class CountDigitInNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        if(n == 0) count++;
        while(n != 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}