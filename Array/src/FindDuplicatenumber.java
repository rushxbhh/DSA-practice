
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicatenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for (int i =1; i < n; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
    }
}
