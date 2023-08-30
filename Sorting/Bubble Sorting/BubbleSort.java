import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,2,3,9,10};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        boolean swapped;

        for(int i = 0; i<arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){ // here we added length of array - i because the last value of the array will be already sorted 
                // swap if the element is smaller than the previous element
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            
            if(swapped == false){
            break;
            }
        }  
    }
}
