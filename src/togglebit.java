public class togglebit {

    public static void main(String[] args){

        var ans = toggle(13, 2 );
        System.out.println(ans);
    }

    private static int toggle(int num, int pos) {
        return ( num ^ (1 << pos));
    }
}
