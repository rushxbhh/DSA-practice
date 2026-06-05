public class longestIncSubsequnece {

    public static void main(String[] args) {

        int nums[] = {4, 6, 7, 1, 19, 67};

        int ans = lis(nums);

        System.out.println(ans);
    }

    public static int lis(int[] arr) {

        int m = arr.length;

        // dp[i][prev+1]
        // i -> current index
        // prev -> previous selected index (-1 means none selected)

        int[][] dp = new int[m + 1][m + 1];

        // bottom-up
        for (int i = m - 1; i >= 0; i--) {

            for (int prev = i - 1; prev >= -1; prev--) {

                // skip current element
                int notTake = dp[i + 1][prev + 1];

                int take = 0;

                // take current element if valid
                if (prev == -1 || arr[i] > arr[prev]) {

                    take = 1 + dp[i + 1][i + 1];
                }

                dp[i][prev + 1] = Math.max(take, notTake);
            }
        }

        return dp[0][0];
    }
}