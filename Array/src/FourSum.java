import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // i j l           r
        // 3 8 0 3 2 3 3 3 1

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 4; i++) {
            for ( int j = i + 1; j < n - 3; j++) {

                int left = j + 1;
                int right = n - 1;

                if( i > 0 && arr[i] == arr[i - 1]) continue;
                if( j > i && arr[j] == arr[j - 1]) continue;

                while( left < right) {

                    int sum = arr[i] + arr[left] + arr[right] + arr[j];

                    if (sum > 0) {
                        right--;
                    } else if ( sum < 0) {
                        left++;
                    }
                    else {

                        List<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        quad.add(arr[j]);

                        ans.add(quad);

                        left++;
                        right--;

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
        }

        System.out.println(ans);
    }
}
