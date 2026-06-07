import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianDataStreams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> minh = new PriorityQueue<>((a , b) -> a - b);

        PriorityQueue<Integer> maxh = new PriorityQueue<>((a , b) -> b - a);

        for( int num : arr) {
            if(maxh.isEmpty() || num <= maxh.peek())
                maxh.add(num);
            else
                minh.add(num);

            if(minh.size() > maxh.size() + 1 ) {
                maxh.add(minh.poll());
            }  else if (maxh.size() > minh.size() + 1){
                minh.add(maxh.poll());
            }
        }

        double med = 0;

        if (minh.size() > maxh.size()){
            med = minh.peek();
        } else if (maxh.size() > minh.size()) {
            med = maxh.peek();
        } else {
            med = (maxh.peek() + minh.peek()) / 2.0;
        }


        System.out.println(med);
    }

}
