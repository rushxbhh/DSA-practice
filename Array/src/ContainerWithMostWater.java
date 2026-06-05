import java.util.Scanner;

public class ContainerWithMostWater {

    public static void main(String[] args) {

      //  index:   0 1 2 3 4 5 6 7 8
      //  height:  1 8 6 2 5 4 8 3 7

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int j = n - 1;
        int i = 0;

        while ( i < j){

            int area;
            int width;
            width = j - i;
            area = width * Math.min(arr[i], arr[j]);
            max = Math.max(area, max);

            if( arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }

        }

        System.out.println(max);
    }
}
