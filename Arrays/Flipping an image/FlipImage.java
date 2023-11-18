import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
        
        System.out.println("\nImage before flipping and inverting\n");
        for(int[] nums : arr){
            System.out.println(Arrays.toString(nums));
        }

        flipAndInvertImage(arr);

        System.out.println("\nImage after flipping and inverting\n");
        for(int[] nums : arr){
            System.out.println(Arrays.toString(nums));
        }

    }
        

    // input     flipping   inverting 
    // 1 1 0      0 1 1      1 0 0
    // 1 0 1      1 0 1      0 1 0
    // 0 0 0      0 0 0      1 1 1


    public static int[][] flipAndInvertImage(int[][] image){
        
        for(int[] row : image){
            // reverse the array 
            for(int i = 0; i<(image[0].length + 1)/2; i++){
                // swap
                int temp = row[i] ^ 1;  // doing xor operation here to invert the binary values
                row[i] = row[image[0].length-i-1];
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }

    // to flip the numbers in an array just swap the values in the array

    // to invert a number u should do num xor 1 which will give u the inverse of that number
    // 1 ^ 1 == 0 , 0 ^ 1 == 1

}
