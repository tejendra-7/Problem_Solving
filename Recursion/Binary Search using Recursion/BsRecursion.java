public class BsRecursion {
    public static void main(String[] args) {
        int[] nums = {2,4,6,9,10,13,155,300,905,1001};
        System.out.println(search(nums, 6, 0, nums.length-1));
    }
    
    static int search(int[] arr , int target , int s , int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
    }
}
