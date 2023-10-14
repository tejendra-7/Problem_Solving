
import java.util.ArrayList;

public class FindDissappearedNums {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,10,12};
        ArrayList<Integer> ans1 = FindNums(nums);
        System.out.println(ans1);
    }

    public static ArrayList<Integer> FindNums(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){   
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);   
                // This loop is going to check if there is any number is missing from 1 to n-1 numbers and add them into this arraylist
            }
        }

        // If all the numbers are present in the arr then it will print the length of array which is the last number which might be the missing
        return ans;
    }

    public static void swap(int[] arr , int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
