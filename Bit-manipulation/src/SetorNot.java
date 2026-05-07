public class SetorNot {
    public static void main(String[] args) {
        int binary = 0b1010; // binary number
        int i = 2; // Position to check

        boolean isSet = setornot(binary, i);
        System.out.println("Is bit " + i + " set? " + isSet);
    }

    public static boolean setornot(int binary, int i) {
        if ((binary & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }
}

