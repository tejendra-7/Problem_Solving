import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m,n;
        System.out.println("Enter number of rows : ");
        m = sc.nextInt();
        System.out.println("Enter number of columns : ");
        n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Taking input of the matrix

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.println("Enter element (" + (i+1)+" , "+(j+1)+")");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix Before Transpose : ");

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        // Transpose

        System.out.println("Matix after Tranpose : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }

        sc.close();
    }
    
}
