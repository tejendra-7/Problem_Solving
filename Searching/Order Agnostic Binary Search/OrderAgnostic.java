import java.util.Scanner;

/**Using a Order Agnostic Binary Search method we can search any type of sorted arrays both ascending and descending sorted arrays 
 * can be searched using order Agnostic Binary Search. This is mainly used when the order of the array is not given.
 */

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-12,-9,-6,-2,3,5,6,8,18,20,23,27,29,33,35};
        System.out.println("Enter a Target number to search in the array : ");
        int target =  sc.nextInt();
        int ans = orderAgnosticBS(arr,target);
        
        if(ans == -1){
            System.out.println("The number you have entered is not found in the given array at any index.");
        }else {
            System.out.println("The number you have entered is found at index : "+ans);
        }
        sc.close();
    }

    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target <arr[mid]){
                    end = mid-1;
                }else if (target > arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if (target < arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
