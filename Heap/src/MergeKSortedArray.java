import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        PriorityQueue<Node> minh = new PriorityQueue<>((a,b) -> a.value - b.value);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){

            Node node = new Node(array[i][0], i, 0);
            minh.add(node);
            // so here i have to add the first element of all the arrays in minh
            // so then one by one pop the heap and add them into the result list or array

        }

        while(!minh.isEmpty()){

            Node current = minh.poll();
            list.add(current.value);

            int nextind = current.eleind + 1;

            if(nextind < array.length) {
                Node node = new Node(array[current.arrind][nextind] , current.arrind, 0);

            }
        }

        // add keep adding element from same array also the other arrays

    }
}

class Node {
    int value;
    int arrind;
    int eleind;

    Node(int value, int arrind, int eleind) {
        this.value = value;
        this.arrind = arrind;
        this.eleind = eleind;
    }

}
