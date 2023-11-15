public class CoutnBitsBW {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n)); 
    }

    private static int setBits(int n){
        int count = 0;

        // while(n > 0){
        //     count++;
        //     n -= (n & -n);
        // }\
        // This is one way 

        while(n > 0){
            count++;
            n = n & (n-1);
        }

        return count;
    }
}
