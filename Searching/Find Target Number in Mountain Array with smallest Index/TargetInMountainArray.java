class TargetInMountainArray {

    public static void main(String[] args){
        int[] arr = {1,2,4,5,6,7,8,10,8,6,4,3,1};
        int firstAns = findInMountainArray(3,arr);
        System.out.println(firstAns);
        int secondAns = findInMountainArray(4,arr);
        System.out.println(secondAns);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int firstTry = orderAgnosticBS(mountainArr, target , 0 , peakInMountainArray(mountainArr));
        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(mountainArr,target,peakInMountainArray(mountainArr)+1,mountainArr.length-1);
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = arr[mid];

            if(midValue == target){
                return mid;
            }

            if(isAsc){
                if(target < midValue){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > midValue){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
