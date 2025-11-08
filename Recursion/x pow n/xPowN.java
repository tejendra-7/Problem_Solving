public class xpown {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(xpown(x, n));
    }

    public static int xpown(int x, int n){
        if(n == 0){
            return 1;
        }
        if( x == 0){
            return 0;
        }

        int xPownm1 = xpown(x,n-1);
        int xpown = x * xPownm1;
        return xpown;
    }
}
