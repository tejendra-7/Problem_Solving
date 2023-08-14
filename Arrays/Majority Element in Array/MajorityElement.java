import java.util.Scanner;
import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int majorNum = majorityElement(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("The majority element in array is : "+majorNum);
        sc.close();
    }
    public static int majorityElement(int[] nums) {
        int count = 0,max = 0;

        for(int num: nums){

            if(count == 0){
                max = num;
            }

            if(num == max){
                count++;
            } else{
                count--;
            }
            
        }
        return max;
    }
}
