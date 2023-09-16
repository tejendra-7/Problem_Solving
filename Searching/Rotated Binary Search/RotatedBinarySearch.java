public class RotatedBinarySearch{
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7,8,9,0,3,4,5,6,7,2};
        int ans = findPivot(arr);
        System.out.println(ans);

        int answer = search(arr, 3);
        System.out.println(answer);
    }

    public static int search(int[] arr , int target){
        int pivot = findPivot(arr);
        
        // if you did not find pivot then the array is not rotated

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // But if you have found pivot that means u have found two ascending sorted arrays in a single array.

        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        
        // If all the above conditions does not execute then this below one will be executed.
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr , int target,int start , int end){

        while(start <= end){

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

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // 4 cases 

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }   
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}