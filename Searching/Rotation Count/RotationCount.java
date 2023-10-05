public class RotationCount{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int rotations = countRotations(arr);
        System.out.println(rotations);


        int[] arr2 = {5,6,7,8,9,10,11,2,3,4};
        int rotations2 = countRotations(arr2);
        System.out.println(rotations2);
    }

    public static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
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

            // If elements at middle, start , end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}