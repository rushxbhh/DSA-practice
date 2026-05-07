


public class Binary2Decimal {

    public static void main(String[] args) {

        var ans = b2d("1100");
        System.out.println(ans);
    }

    public static int b2d(String binary){

        int n = binary.length();
        int num = 0;
        int power = 1;

        for(int i = n-1; i >= 0; i--){
            if (binary.charAt(i) == '1') {
                num = num + power;
            }
            power = power * 2;
        }

        return num;
    }
}
