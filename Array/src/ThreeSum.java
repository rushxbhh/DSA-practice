import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum > target) {
                    right--;
                }

                else if (sum < target) {
                    left++;
                }

                else {

                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(arr[i]);
                    triplet.add(arr[left]);
                    triplet.add(arr[right]);

                    ans.add(triplet);

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}