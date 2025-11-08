public class FactRecursion {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factRec(num));
    }

    public static int factRec(int n){
        if(n == 1 || n == 0){       // this is edge condition
            return 1;
        }

        int fact_nm1 = factRec(n-1);  // this is where the recursion happens
        int factn = n * fact_nm1;     // this is the main logic
        
        return factn;
    }
}
