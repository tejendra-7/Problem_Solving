// ceiling program is to find the target number or the smallest number greater than the target number.
// But if both does not exist it will print -1 as the output.

public class CeilingSearch {
    public static void main(String[] args) {
        int[] nums= {1,3,5,7,9,10,13,16,18,19,200,300,500,1999};
        int target = 350;
        int ceilingIndex = ceiling(nums, target);

        if(ceilingIndex == -1){
            System.out.println("There is no ceiling element because all the values in the array are less than the target number that you entered.");
        }else{
            System.out.println("The ceiling number is found at the index "+ceilingIndex);
            System.out.println("And the ceiling number is "+nums[ceilingIndex]);
        }

    }
// let's assume that the array is sorted in a ascending order 
    public static int ceiling(int arr[] , int target){

        int start = 0;
        int end = arr.length-1;

        if(arr[end] < target){
            return -1;
        }

        int mid; 
        while(start <= end){
            mid = start + (end - start)/2;
            
            if(target > arr[mid]){
                start = mid+1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
        // here we are choosing start index because when the while loop breaks the start index will be greater than the middle and end 
        // as here we took the ascending array so at the index higher than the mid we will have a greater number which will be the ceiling for the target num
    }
}
