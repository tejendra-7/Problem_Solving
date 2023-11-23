public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sievesMethod(n, primes);
    }

    static void sievesMethod(int n, boolean[] primes){
        for(int i = 2; i*i<= n; i++){ // only iterate upto the square root of n value
            if(!primes[i]){ // deafult value of primes is false so !primes == true
                for(int j = i*2; j<=n; j+=i){   // to eliminate every factor of the number which is already false at the start
                    primes[j] = true;
                }
            }
        }

        for(int i = 2; i<=n; i++){
            if(!primes[i]){
                System.out.print((i+" "));
            }
        }
    }
}
