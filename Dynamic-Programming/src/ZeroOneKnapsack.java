
public class ZeroOneKnapsack {
    public static void main(String[] args) {
           int weight[] = {4, 8, 1, 7, 8};
        int profit[] = {10, 13, 4, 23, 2};
        int cap = 15;
        int ans = knapsack(weight, profit, cap);
        System.out.println(ans);
    }

    public static int knapsack(int[] w, int[] p, int W){

      int m = w.length;

        int[][] dp = new int[m+1][W+1];

        for(int i = 0; i <= m; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= W; j++){
            dp[0][j] = 0;
        }

        for (int i = 1; i <= m; i++){
            for (int j =1; j <= W;j++){
                if (w[i-1] <= j){
                    dp[i][j] =  Math.max(p[i-1] + dp[i-1][j - w[i-1]], dp[i-1][j]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][W];
    }
}