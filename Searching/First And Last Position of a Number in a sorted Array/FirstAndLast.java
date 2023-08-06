// 

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,4,4,4,5,6,6,9,9,9,9,11,11};
        int[] answer  = searchRange(arr,4);
        System.out.println(Arrays.toString(answer));
        
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        int max = 0 , min = 0 , mid = 0 ;
        int[] ans = {-1,-1};

        if(nums.length == 0){
            return ans;
        }

        while(start <= end){
            mid = start+(end - start)/2;

            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else {
                break;
            }
            
        }

        if(nums[mid] != target){
            return ans;
        }
        
        //This will go on looping for numbers of index less than the target number
        for(int i = mid; i>=0; i--){
            if(nums[i] != target){
                min = i+1;
                break;
            }
            min = i;
        }
        //This will go on looping for numbers of index higher than the target number
        for(int i = mid; i<=nums.length-1; i++){
            if(nums[i] != target){
                max = i-1;
                break;
            }
            max = i;
        }

        int[] ans2 = {min , max};

        return ans2;
    }
}
