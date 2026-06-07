import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKthList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k + 1; i++) {
            pq.add(arr[i]);
        }

        for (int i = k + 1; i < n; i++) {
            res.add(pq.poll());
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()) {
            res.add(pq.poll());
        }


    }
}
