// Given a binary array nums, return the maximum number of consecutive 1's in the array.
//  * 
//    Example 1:
//    Input: nums = [1,1,0,1,1,1]
//    Output: 3
//    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//    Example 2:
//    Input: nums = [1,0,1,1,0,1]
//    Output: 2
public class CountOnes {
    public static void main(String[] args) {
        int[] nums ={1,1,0,0,1,1,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int maxOnes = 0;
        int count = 0;
// [1,1,0,0,1,1,1,0]
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxOnes = Math.max(count,maxOnes);
            }else{
                count = 0;
            }
        }

        return maxOnes;
        
    }
}

