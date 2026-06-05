import java.util.Scanner;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        longestSubArrayWithSumK(arr, 4);
    }

    public static void longestSubArrayWithSumK(int[] nums, int k) {

        int i = 0;
        int sum = 0;

        int maxLen = 0;

        int start = -1;
        int end = -1;

        for (int j = 0; j < nums.length; j++) {

            sum += nums[j];

            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            if (sum == k) {

                int currentLen = j - i + 1;

                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    start = i;
                    end = j;
                }
            }
        }

        if (start == -1) {
            System.out.println("No subarray found");
            return;
        }

        System.out.println("Longest subarray with sum " + k);

        for (int x = start; x <= end; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}