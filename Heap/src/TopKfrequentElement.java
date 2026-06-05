import java.util.*;

public class TopKfrequentElement {
     public static void main(String[] args) {


         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();

         int[] arr = new int[n];

         for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
         }


         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i : arr ) {
             map.put(i, map.getOrDefault(i, 0) + 1);
         }

         PriorityQueue<Map.Entry<Integer, Integer>> minh = new PriorityQueue<>(( a , b) ->
                 Integer.compare(a.getValue(), b.getValue()));

         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             minh.add(entry);
             if (minh.size() > k) {
                 minh.poll();
             }
         }

         List<Integer> result = new ArrayList<>();

         while(!minh.isEmpty()){
             result.add(minh.poll().getKey());
         }

         Collections.reverse(result);
     }
}
