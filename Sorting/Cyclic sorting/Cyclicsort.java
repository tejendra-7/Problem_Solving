import java.util.Arrays; 
public class Cyclicsort {
    public static void main(String[] args) {
        int[] nums = {6,4,7,8,2,1,3,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; 
            // this is the condition when the numbers starts from 1 at 0 index
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    public static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
