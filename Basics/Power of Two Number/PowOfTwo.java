public class PowOfTwo {
    public static void main(String[] args) {
        int n = 32;

        // This logic will check if the given number is a power of 2 by using bitwise operation
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
