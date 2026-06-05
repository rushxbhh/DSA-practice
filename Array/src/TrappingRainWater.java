import java.util.Scanner;

public class TrappingRainWater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxL = 0;
        int maxR = n - 1;
        int left = 1;
        int right = n - 2;
        int total = 0;

        while ( left < right) {

            if(maxL < maxR) {
                if (arr[left] > arr[maxL]) {
                    maxL++;
                    left++;
                }
                  int water = arr[maxL] - arr[left];
                total += water;
            } else {
                if (arr[right] > arr[maxR]) {
                    maxR--;
                    right--;
                }
                int water = arr[maxR] - arr[right] ;
                total += water;
            }
        }

       System.out.println(total);
    }
}
// 6 7 2 3 1 8