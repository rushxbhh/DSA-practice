public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // Perform the swap using bitwise XOR
        a = a ^ b; // Step 1: a = a XOR b
        b = a ^ b; // Step 2: b = (a XOR b) XOR b = a
        a = a ^ b; // Step 3: a = (a XOR b) XOR a = b

        System.out.println("a and b after swap: " + a + ", " + b);
    }
}


