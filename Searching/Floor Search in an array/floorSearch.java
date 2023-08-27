// floor search is the program to find the number in a array which is target number or the number greatest in the array which is smaller than the target number

public class floorSearch {
    public static void main(String[] args) {
        int[] nums= {1,3,5,7,9,10,13,16,18,19,200,300,500,1999};
        int target = 350;
        int floorIndex = floor(nums, target);

        if(floorIndex == -1){
            System.out.println("There is no ceiling element because all the values in the array are less than the target number that you entered.");
        }else{
            System.out.println("The ceiling number is found at the index "+floorIndex);
            System.out.println("And the ceiling number is "+nums[floorIndex]);
        }

    }
// let's assume that the array is sorted in a ascending order 
    public static int floor(int arr[] , int target){

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
        return end;
        // here we are choosing end index because when the while loop breaks the end index will be smaller than the middle and start
        // as here we took the ascending array so at the index smaller than the mid we will have a smaller number which will be the floor for the target num
    }
}

