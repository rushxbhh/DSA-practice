public class moveelementby1place {
    public static void main(String[] hell){

        int[] arr = { 4, 8, 9, 2, 6 };
        move(arr);
        printArray(arr);
        // 4 8 9 2 3     -> 8 9 2 3 4
        // 4 9 3 1 7 8 ->  9 3 1 7 8 4
    }

    public static void move(int arr[]){
        int temp = arr[0];

        for (int i = 1; i < arr.length ; i++){
            arr[i-1] = arr[i];
        }
         arr[arr.length - 1] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
