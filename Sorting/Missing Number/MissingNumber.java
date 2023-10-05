
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0};
        int ans = missingNumber(arr);
        System.out.println(ans);

    }

    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;   
                // This loop is going to check if there is any number is missing from 1 to n-1 numbers
            }
        }

        // If all the numbers are present in the arr then it will print the length of array which is the last number which might be the missing
        return arr.length;
    }

    public static void swap(int[] arr , int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
