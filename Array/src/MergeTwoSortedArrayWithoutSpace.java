import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrayWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] num1 = new int[n+m];
        int[] num2 = new int[n];

        for(int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }

        for(int j = 0; j < num2.length; j++) {
            num1[j] = sc.nextInt();
        }

        int i = num1[m+1];
        int j = num2[0];
        int k = num1[n+m];

        for (int x = i; x < k; x++) {
            num1[x] = num2[j];
            j++;
        }

        Arrays.sort(num1);
    }
}
