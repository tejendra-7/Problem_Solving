// Q. Write a program to print fibonacci series of nth index.
   
//    fibbonacci series = 0, 1, 1, 2, 3, 5, 8, 13, .......
//  * F(0) = 0, F(1) = 1
//    F(n) = F(n - 1) + F(n - 2), for n > 1.

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int ans = recFib(n);
        System.out.println(ans);
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int next = 0;
        int a = 0; // 1st term;
        int b = 1; // 2nd term

        for(int i = 2; i<=n; i++){
            next = a+b; // 2
            a = b;
            b = next;
        }

        return next;
    }

    public static int recFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return recFib(n-1) + recFib(n-2); // n = 5 n-1 + n-2 == 4 + 3 == 5 == 1+0 == 1
    }

}
