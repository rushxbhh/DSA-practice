public class leftRotateByKPlaces {

    public static void main(String[] hell){

        int[] num = {1,2,3,4,5,6,7};
        move(num,3);
        printArray(num);
        // 1 2 3 4 5 6 7  if k = 3
        // 4 5 6 7 3 2 1

        // so if 1 2 3 reversed   3 2 1 4 5 6 7
        // second half reversed   3 2 1 7 6 5 4
        // then again reversed    4 5 6 7 1 2 3
    }


    public static void move(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0,k-1 );
        reverse(arr, k , n-1);
        reverse(arr, 0,n-1);
    }

    public static void reverse(int[] arr, int st, int end){
        while( st < end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end --;
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
