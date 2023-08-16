import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {34, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 37)));
        // this will give the output of the index value where the number 37 lies in the matrix
    }

    public static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length-1;

        while(r<matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c}; // if the value is found then it will print the indexes as an array
            }
            if (matrix[r][c] > target){
                c--;  // this will decrese because all the elmeents in that col will be greater than the top most number
            } else {
                r++; // this will go to the next row which cause we need higher number 
            }
        }
        return new int[]{-1,-1}; // this will print -1 -1 array if the numbers are not existing in the matrix
    }
}
