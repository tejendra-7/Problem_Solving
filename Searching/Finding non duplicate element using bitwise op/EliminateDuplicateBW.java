public class EliminateDuplicateBW {
    public static void main(String[] args) {
        int[] nums = {2,3,3,4,8,4,2,9,9};
        int ans = ans(nums);
        System.out.println(ans);
    }

    private static int ans(int[] arr){
        int u = 0;

        for(int n : arr){
            u ^= n;
        }

        return u;
    }
}   
