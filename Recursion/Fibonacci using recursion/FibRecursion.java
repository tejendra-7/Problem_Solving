public class FibRecursion {
    public static void main(String[] args) {
        int ans = fib(4);
        System.out.println("The 4th element in the fibonacci series is : "+ans);
    }

    static int fib(int n){
        if(n < 2){
            return n;
            // here we are not even passing the f(0) and f(1) value we are just giving 
            // if n = 1 value is 1 and n = 0 value is 0 and from n = 2 it will it will go into fib function 
        }
        return fib(n-1)+fib(n-2);
    }
}
