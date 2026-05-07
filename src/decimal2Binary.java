import java.lang.*;

public class decimal2Binary {
    public static void main(String[] args){

              var ans = d2b(13);
              System.out.println(ans);
    }


    public static StringBuffer d2b(int num){
        StringBuffer result = new StringBuffer();

        while(num != 1){
            if(num % 2 == 1) {
                result.append(1);
            } else {
                result.append(0);
            }
            num = num/2;
        }
        result.reverse();
        return result;
    }
}