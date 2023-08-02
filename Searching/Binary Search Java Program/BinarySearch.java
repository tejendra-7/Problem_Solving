import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {-12,-9,-6,-2,0,3,5,6,8,18,20,23,27,29,33,35};
        System.out.println("Enter an element of the array to search : ");
        int target = sc.nextInt();
        int ans = binarySearch(arr,target);

        if(ans == -1){
            System.out.println("The number you have entered is not found in the given array at any index.");
        }else {
            System.out.println("The number you have entered is found at index : "+ans);
        }

        sc.close();
    }
    
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;
            // formula to find middle element of the array

            if( target < arr[mid] ){
                end = mid-1;
            }else if ( target > arr[mid] ){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    

}
