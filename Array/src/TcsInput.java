import java.util.ArrayList;
import java.util.Scanner;

public class TcsInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
               arr[i] = sc.nextInt();
               list.add(sc.nextInt());
        }

        for(int a : arr){
            System.out.println(a + " ");
        }
    }
}
