import java.util.Scanner;

public class DutchAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }
        sort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void sort(int nums[]) {

        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while ( mid <= high) {
            if (nums[mid] == 0) {
                swap(nums,mid, low);
                mid++;
                low++;
            }
            else if (nums[mid] == 1)  {
                mid++;
            } else if (nums[mid] == 2){
                swap(nums,mid, high);
                high--;
            }
        }
    }

}
