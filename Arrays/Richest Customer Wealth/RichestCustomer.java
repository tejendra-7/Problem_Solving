// https://leetcode.com/problems/richest-customer-wealth/description/
// This is a leet code problem go to the above link to solve the problem

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,},{1,1,1},{10,1,1}};

        int answer = maximumWealth(arr);
        System.out.println(answer);

    }

    static int maximumWealth(int[][] arr){
        int sum = 0,ans = 0;

        for(int[] nums : arr){
            //This will now go inside the 2d array and have access to the 1d array
            for(int num:nums){
                // this will iterate over the 1d array and add numbers to sum variable
                sum += num;
            }
            // ans will change only if the sum of the numbers of a particular array is greater than previous ans value
            if(sum>ans){
                ans = sum;
            }
            // after every iteration sum value will again start from 0
            sum = 0;
        }
        return ans;
    }
}
