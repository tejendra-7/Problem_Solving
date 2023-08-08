import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10]; // this is how we declare an array with a size
        int t;

        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        

        for(int x = 0 ; x<nums.length; x++){
            for(int y = x+1; y<nums.length; y++){
                if(nums[x] > nums[y]){
                    t = nums[x];
                    nums[x] = nums[y];
                    nums[y] = t;
                }
            }
        }

        for(int j = 0; j<nums.length; j++){
            System.out.print(nums[j]+" ");
        }
        sc.close();
    }
}
