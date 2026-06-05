import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> minh = new PriorityQueue<>();

        for (int i : arr) {
            minh.add(arr[i]);
            if (minh.size() > k) {
                minh.poll();
            }
        }

        System.out.println(minh.peek());
    }
}