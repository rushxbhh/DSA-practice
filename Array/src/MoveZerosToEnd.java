public class MoveZerosToEnd {

    public static void main(String[] hell){

         int nums[] = {2, 0, 1, 0, 3, 6};
         func(nums);
         printArray(nums);
        //  2 0 1 0 3 6  moves zeros to the end
        //  ij         2
        //    ij
        //    i j
        //  2 1 3 6 0 0
    }

    public static void func(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }

        while( i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
