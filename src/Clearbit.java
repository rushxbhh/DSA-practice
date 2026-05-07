public class Clearbit {

    public static void main(String[] args) {
        int i = 2; // Position to clear
        int num = 13; //  number

        var ans = clearbit(num, i);
        System.out.println("Number after clearing bit " + i + ": " + ans);
    }

    public static int clearbit(int num, int i) {
        return (num & ~(1 << i));

//        1 1 0 1 isme hum 2nd pos 1 ko 0 krna h -> 1 0 0 1
//
//            1. left shift of pos with 1 -> 0 1 0 0  --> take not of this -> 1 0 1 1
//            2. 1 1 0 1
//          &    1 0 1 1     --> and of both
//               1 0 0 1  ans
    }
}
