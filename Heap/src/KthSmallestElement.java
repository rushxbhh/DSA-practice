import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());

        for( int i : arr) {
            maxh.add(arr[i]);
            if (maxh.size() > k) {
                maxh.poll();
            }
        }

        System.out.println(maxh.peek());
    }
}
