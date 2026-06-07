import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthClosestToOrigin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of points
        int k = sc.nextInt();

        int[][] points = new int[n][2];

        for(int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        PriorityQueue<Pairs> pairs = new PriorityQueue<>((a,b) -> b.dist - a.dist);

        for (int i = 0; i < points.length; i++ ) {
            int x = points[i][0];
            int y = points[i][1];

            int distance = x*x + y*y;

            Pairs pair1 = new Pairs(x,y, distance);
            pairs.add(pair1);
            if (pairs.size() > k) {
                pairs.poll();
            }
        }

        List<Pairs> res = new ArrayList<>();
        while(!pairs.isEmpty()) {
            res.add(pairs.poll());
        }

        for(Pairs p : res) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }

}

class Pairs {
    int x;
    int y;
    int dist;

    Pairs(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
