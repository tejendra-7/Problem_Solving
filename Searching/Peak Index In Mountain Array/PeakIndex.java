
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,4,3,2,1};
        int ans = peakIndex(arr1);
        System.out.println("The Peak Index Value is : "+ans);
    }   

    public static int peakIndex(int[] arr) {
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
