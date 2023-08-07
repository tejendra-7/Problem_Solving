
public class IndexInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10,12,13,15,16,17,18};
        int target = 10;

        System.out.println(ans(nums,target));
    }

    static int ans(int[] arr , int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        while(target > arr[end]){
            int newStart = end+1;
            //double the box value 
            // new end = previous end + sizeofbox * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;   
        }

        return binarySearch(arr, target, start, end);
    }
    
    static int binarySearch(int[] arr , int target , int start , int end){
        while(start <= end ){

            int mid = start + (end - start)/2;

            if(target > arr[mid]) {
                start = mid+1;
            }else if (target < arr[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

