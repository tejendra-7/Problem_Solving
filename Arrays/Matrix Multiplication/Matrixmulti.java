import java.util.Scanner;
import java.util.Arrays;
public class Matrixmulti{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2,sum;
        System.out.println("Enter the rows of the first matrix : ");
        r1 = sc.nextInt();
        System.out.println("Enter the cols of first matrix : ");
        c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];

        for(int i = 0; i<r1; i++){
            for(int j = 0; j<c1; j++){
                System.out.println("Enter element of "+(i+1)+" row "+(j+1)+" coloumn : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the rows of second matrix : ");
        r2 = sc.nextInt();
        System.out.println("Enter the cols of second matrix : ");
        c2 = sc.nextInt();

        int[][] matrix2 = new int[r2][c2];
        for(int i = 0; i<r2; i++){
            for(int j = 0; j<c2; j++){
                System.out.println("Enter element of "+(i+1)+" row "+(j+1)+" coloumn : ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matirx : ");
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println("Second Matrix : ");
        System.out.println(Arrays.deepToString(matrix2));
    
    
        int[][] solution = new int[r1][c2];

        if(c1 == r2){
            
            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c2; j++){
                    sum = 0;
                    for(int k = 0; k<c1; k++){  // We used k condition as the c1 because both c1 and r2 are same and we need to access them to multiply
                        sum += matrix1[i][k] * matrix2[k][j];  
                        // we are writing this in loop because the multiplication will happen all over the the row of first matrix and column of second matrix
                        // we can put k value condition as c1 or r2 (k is used to access the elements in the first and second matrix for multiplication)
                    }
                    solution[i][j] = sum; // and then we are storing the value in solution matrix
                }
            }

            System.out.println("After Multiplication we get this matrix : \n");
            System.out.println(Arrays.deepToString(solution));
        }else{
            System.out.println("The multiplication of the Matrices is not possible.");
        }

        sc.close();
    }
}