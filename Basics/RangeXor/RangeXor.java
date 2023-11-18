public class RangeXor {
    public static void main(String[] args) {
        // range xor for a , b = xor(b) ^ xor(a-1)

        int a = 3;
        int b = 9;

        // 3^4^5^6^7^8^9 === 2
        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);

        // This is the general way to do using a for loop
        int ans2 = 0;

        for(int i = a; i<=b; i++){
            ans2 ^= i;
        }

        System.out.println(ans2);

    }

    static int xor(int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }

        return 0;
    }
}
