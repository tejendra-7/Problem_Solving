public class SquareRootBS {
    public static void main(String[] args) {
        int ans1 = sqrt(9);
        int ans2 = sqrt(16);
        System.out.println("The square root of 9 : "+ans1);
        System.out.println("The square root of 16 : "+ans2);
    }   
    
    public static int sqrt(int x){
        if(x == 0){
            return 0;
        }

        int first = 1;
        int last = x;

        while(first<=last){
            int mid = first + (last-first)/2;
            if(mid == x/mid){
                return mid;
            }else if(last > x/mid){
                last = mid-1;
            }else {
                first = mid+1;
            }
        }

        return last;
    }
}
