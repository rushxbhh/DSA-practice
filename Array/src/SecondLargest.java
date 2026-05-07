
public class SecondLargest {
    public static void main(String[] args) {

       int arr[] = { 4, 6, 1, 9 , 7};
       var ans = findsecond(arr);
       System.out.println(ans);
    }

    public static int findsecond(int arr[]){
        int larg = -12;
        int second = -13;

        for (int num : arr){
              if (num > larg)
              {
                  larg = num;
                  second = larg;
              }
              else if (num > second & num < larg) {
                  second = num;
              }
        }

        return second;
    }

}