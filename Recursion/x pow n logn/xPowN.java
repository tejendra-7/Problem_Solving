public class xPowN {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(calcPow(x, n));
    }

    public static int calcPow(int x , int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        // this is the same calculating power but with O(log n) time complexity.

        if(n %2 == 0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }else{
            // if n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        } 
    }
    
}
