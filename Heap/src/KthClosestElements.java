import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthClosestElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int key = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Pair> maxh = new PriorityQueue<>((a,b) -> b.dist - a.dist);

        for (int num : arr) {
            int distance = Math.abs(key - num);
            Pair p = new Pair(num, distance);
            maxh.add(p);
            if (maxh.size() > k) maxh.poll();
        }

        List<Integer> result = new ArrayList<>();

        while(!maxh.isEmpty()) {
            result.add(maxh.poll().num);
        }

        System.out.println(result);

    }
}

class Pair {
    int num;
    int dist;

    Pair( int num, int dist) {
        this.num = num;
        this.dist = dist;
    }
}
