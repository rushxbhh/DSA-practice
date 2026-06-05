import java.util.Scanner;

public class MaximumSumSubArrayOfSizeK {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       int ans = maxx(arr, 5);
        System.out.println(ans);
    }


    public static int maxx(int[] nums, int k){


        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int i = 0;

        if (k > nums.length) return  -1;
        for (int j  = 0; j < nums.length; j++) {

            //int currlen = j - i + 1;

            if( j - i + 1 < k) {
                currsum += nums[j];
            }
            else if ( j - i + 1 == k) {
                currsum += nums[j];
                maxsum = Math.max(currsum , maxsum);
                currsum -= nums[i];
                i++;
                }
        }
        return maxsum;
    }
}
